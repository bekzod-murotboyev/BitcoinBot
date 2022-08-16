package uz.pdp.bitcoin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.pdp.bitcoin.entity.User;
import uz.pdp.bitcoin.feign.BitcoinFeign;
import uz.pdp.bitcoin.model.bank.BankItem;
import uz.pdp.bitcoin.model.bitcoin.*;
import uz.pdp.bitcoin.payload.SecondDTO;

import java.io.IOException;
import java.util.*;

import static uz.pdp.bitcoin.util.Constant.*;

@Service
@RequiredArgsConstructor
public class TelegramBot {


    private final LanguageService lanService;

    private final UserService userService;

    private final InlineKeyboardService inService;

    private final BitcoinFeign bitcoinFeign;

    private final BankService bankService;


    public SendMessage changeLanguageSend(Update update) {
        Message message = getMessage(update);

        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        row.add(inService.getBtn(UZ, UZ));
        row.add(inService.getBtn(RU, RU));
        row.add(inService.getBtn(EN, EN));
        return inService
                .getSendMessage(message.getChatId().toString(),
                        WELCOME_TEXT, inlineKeyboardMarkup);
    }

    public EditMessageText changeLanguageEdit(Update update, String lan) {

        Message message = update.getCallbackQuery().getMessage();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        row1.add(inService.getBtn(UZ, UZ));
        row1.add(inService.getBtn(RU, RU));
        row1.add(inService.getBtn(EN, EN));
        row2.add(inService.getBtn(SETTINGS, lanService.getWord(BACK, lan)));
        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(CHANGE_LANGUAGE_TEXT, lan),
                message.getMessageId(),
                inlineKeyboardMarkup);
    }

    public SendMessage getSendMessageMenu(Update update, String lan) {
        String chatId = update.getMessage().getChatId().toString();
        InlineKeyboardMarkup markup = inService.createMarkup(Arrays.asList(
                Arrays.asList(BALANCE, PROFIT),
                Arrays.asList(MANAGEMENT, SETTINGS)
        ), lan);
        return inService.getSendMessage(chatId, lanService.getWord(MENU_TEXT, lan), markup);
    }

    public EditMessageText getEditMessageMenu(Update update, String lan) {
        Message message = update.getCallbackQuery().getMessage();
        InlineKeyboardMarkup markup = inService.createMarkup(Arrays.asList(
                Arrays.asList(BALANCE, PROFIT),
                Arrays.asList(MANAGEMENT, SETTINGS)
        ), lan);

        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(MENU_TEXT, lan),
                message.getMessageId(),
                markup);
    }

    public EditMessageText getBalance(Update update, String lan) {
        Data data = bitcoinFeign.getData().getData();
        String symbol = data.getSymbol();

        double last24Hour = (double) Math.round(data.getMarketData().getPercentChangeUsdLast24Hours() * 100) / 100;
        double priceUsd = (double) Math.round(data.getMarketData().getPriceUsd() * 100) / 100;

        Message message = update.getCallbackQuery().getMessage();
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        inlineKeyboardMarkup.setKeyboard(rowList);
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowList.add(row);
        rowList.add(row1);
        row.add(inService.getBtn(BALANCE, String.valueOf(priceUsd).concat(" $")));
        row1.add(inService.getBtn(STATISTICS, lanService.getWord(STATISTICS, lan)));
        row1.add(inService.getBtn(BACK_TO_MENU, lanService.getWord(BACK, lan)));
        String text = "<b>" +
                symbol +
                "/BUSD\t\t" +
                (last24Hour < 0 ? " ↙ ️" : " ↗ ️") +
                last24Hour +
                " %</b>";
        EditMessageText editMessageText = inService.getEditMessageText(message.getChatId().toString(),
                text,
                message.getMessageId(),
                inlineKeyboardMarkup);
        editMessageText.enableHtml(true);
        return editMessageText;
    }

    public EditMessageText getInvestmentEdit(Update update, String lan) {
        Message message = update.getCallbackQuery().getMessage();
        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(INVESTMENT_TEXT, lan),
                message.getMessageId(),
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_MENU)), lan));
    }

    public SendMessage getInvestmentSend(Update update, String lan) {
        Message message = update.hasMessage() ? update.getMessage() : update.getCallbackQuery().getMessage();
        return inService.getSendMessage(message.getChatId().toString(),
                lanService.getWord(INVESTMENT_TEXT, lan),
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_MENU)), lan));
    }


    public EditMessageText getEditBitcoin(Update update, String lan) {
        Message message = getMessage(update);
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        row.add(inService.getBtn(PROFIT,lanService.getWord(BACK, lan)));

        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(BITCOIN_TEXT, lan),
                message.getMessageId(),
                inlineKeyboardMarkup);
    }

    public SendMessage getSendBitcoin(Update update, String lan) {
        Message message = getMessage(update);

        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        row.add(inService.getBtn(PROFIT,lanService.getWord(BACK, lan)));

        return inService.getSendMessage(message.getChatId().toString(),
                lanService.getWord(BITCOIN_TEXT, lan),
                inlineKeyboardMarkup);
    }

    public SendMessage getProfit(Update update, String lan) throws IOException {
        Message message = getMessage(update);

        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        row.add(inService.getBtn(BACK_TO_MENU,lanService.getWord(MENU, lan)));
        SecondDTO amounts = userService.getAmount(update);
        double priceUsd = bitcoinFeign.getData().getData().getMarketData().getPriceUsd();
        double oneUsd = 0, oneRub = 0;
        double money = amounts.getMoney();
        double bitcoin = amounts.getBitcoin();
        priceUsd = bitcoin * priceUsd - money;
        priceUsd -= priceUsd * 0.01;

        BankItem[] bankData = bankService.getData();
        for (BankItem bank : bankData) {
            if (bank.getCcy().equals("USD")) {
                oneUsd = bank.getRate();
            }
            if (bank.getCcy().equals("RUB")) {
                oneRub = bank.getRate();
            }
        }

        String text = lanService.getWord(USD_PROFIT_TEXT, lan) +
                (double) Math.round(priceUsd * 100) / 100 +
                " $\n" +
                lanService.getWord(RUB_PROFIT_TEXT, lan) +
                (double) Math.round(priceUsd * oneUsd * 100 / oneRub) / 100 +
                lanService.getWord(RUBLE, lan) +
                "\n" +
                lanService.getWord(UZS_PROFIT_TEXT, lan) +
                (double) Math.round(priceUsd * oneUsd * 100) / 100 +
                lanService.getWord(SOUM, lan);
        return inService.getSendMessage(message.getChatId().toString(),
                text,
                inlineKeyboardMarkup);
    }

    public SendMessage setWaitText(Update update, String lan) {
        return new SendMessage(getMessage(update).getChatId().toString(),lanService.getWord(WAIT, lan));
    }

    public SendMessage setError(Update update) {
        return new SendMessage(getMessage(update).getChatId().toString(),ERROR);
    }

    public DeleteMessage deleteMessage(Update update) {
        Message message = getMessage(update);
        return new DeleteMessage(message.getChatId().toString(),message.getMessageId());
    }

    public EditMessageText getSettings(Update update, String lan) {
        Message message = getMessage(update);
        InlineKeyboardMarkup markup = inService.createMarkup(Arrays.asList(
                Collections.singletonList(CHANGE_LANGUAGE),
                Collections.singletonList(BACK_TO_MENU)
        ), lan);
        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(SELECT_ACTION, lan),
                message.getMessageId(),
                markup);
    }

    public EditMessageText getMenuStatistics(Update update, String lan) {
        Message message = getMessage(update);
        InlineKeyboardMarkup markup = inService.createMarkup(Arrays.asList(
                Arrays.asList(LAST_ONE_HOUR, LAST_ONE_DAY, ALL_TIME),
                Collections.singletonList(BACK_TO_BALANCE)
        ), lan);

        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(SELECT_ACTION, lan),
                message.getMessageId(),
                markup);
    }

    public EditMessageText getMenuAllTime(Update update, String lan) {
        Message message = update.getCallbackQuery().getMessage();
        InlineKeyboardMarkup markup = inService.createMarkup(Arrays.asList(
                Arrays.asList(HIGH, LOW),
                Collections.singletonList(BACK_TO_STATISTICS)
        ), lan);


        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(SELECT_ACTION, lan),
                message.getMessageId(),
                markup);
    }

    public EditMessageText getLastOneHour(Update update, String lan){
        OhlcvLast1Hour hour = bitcoinFeign.getData().getData().getMarketData().getOhlcvLast1Hour();
        Message message = getMessage(update);
        String text = "\t\t\t\t" + lanService.getWord(LAST_ONE_HOUR, lan) +
                "\n" +
                lanService.getWord(OPEN, lan) +
                (double) Math.round(hour.getOpen() * 100) / 100 +
                " $\n" +
                lanService.getWord(MAX, lan) +
                (double) Math.round(hour.getHigh() * 100) / 100 +
                " $\n" +
                lanService.getWord(MIN, lan) +
                (double) Math.round(hour.getLow() * 100) / 100 +
                " $\n" +
                lanService.getWord(CLOSE, lan) +
                (double) Math.round(hour.getClose() * 100) / 100 +
                " $\n";

        return inService.getEditMessageText(message.getChatId().toString(),
                text,
                message.getMessageId(),
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_STATISTICS)), lan));
    }

    public EditMessageText getLastOneDay(Update update, String lan) throws IOException {


        OhlcvLast24Hour day = bitcoinFeign.getData().getData().getMarketData().getOhlcvLast24Hour();

        Message message = getMessage(update);
        String text = "\t\t\t\t" + lanService.getWord(LAST_ONE_DAY, lan) +
                "\n" +
                lanService.getWord(OPEN, lan) +
                (double) Math.round(day.getOpen() * 100) / 100 +
                " $\n" +
                lanService.getWord(MAX, lan) +
                (double) Math.round(day.getHigh() * 100) / 100 +
                " $\n" +
                lanService.getWord(MIN, lan) +
                (double) Math.round(day.getLow() * 100) / 100 +
                " $\n" +
                lanService.getWord(CLOSE, lan) +
                (double) Math.round(day.getClose() * 100) / 100 +
                " $\n";

        return inService.getEditMessageText(message.getChatId().toString(),
                text,
                message.getMessageId(),
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_STATISTICS)), lan));
    }

    public EditMessageText getAllHigh(Update update, String lan) throws IOException {
        AllTimeHigh high = bitcoinFeign.getData().getData().getAllTimeHigh();

        Message message = getMessage(update);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        inlineKeyboardMarkup.setKeyboard(rowList);
        List<InlineKeyboardButton> row = new ArrayList<>();
        rowList.add(row);
        row.add(inService.getBtn(ALL_TIME,lanService.getWord(BACK, lan)));

        String text = lanService.getWord(HIGH, lan) +
                "\n" +
                lanService.getWord(PRICE, lan) +
                (double) Math.round(high.getPrice() * 100) / 100 +
                " $\n" +
                lanService.getWord(DATE, lan) +
                high.getAt().substring(0, 10) +
                "\n" +
                lanService.getWord(PERCENT, lan) +
                (double) Math.round(high.getPercentDown() * 100) / 100 +
                " %\n" +
                lanService.getWord(PAST_TENSE, lan) +
                high.getDaysSince() +
                lanService.getWord(DAY, lan);

        return inService.getEditMessageText(message.getChatId().toString(),
                text,
                message.getMessageId(),
                inlineKeyboardMarkup);
    }

    public EditMessageText getAllLow(Update update, String lan) throws IOException {
        CycleLow low = bitcoinFeign.getData().getData().getCycleLow();

        Message message = getMessage(update);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        inlineKeyboardMarkup.setKeyboard(rowList);
        List<InlineKeyboardButton> row = new ArrayList<>();
        rowList.add(row);
        row.add(inService.getBtn(ALL_TIME,lanService.getWord(BACK, lan)));
        String text = lanService.getWord(LOW, lan) +
                "\n" +
                lanService.getWord(PRICE, lan) +
                (double) Math.round(low.getPrice() * 100) / 100 +
                " $\n" +
                lanService.getWord(DATE, lan) +
                low.getAt().substring(0, 10) +
                "\n" +
                lanService.getWord(PERCENT, lan) +
                (double) Math.round(low.getPercentUp() * 100) / 100 +
                " %\n" +
                lanService.getWord(PAST_TENSE, lan) +
                low.getDaysSince() +
                lanService.getWord(DAY, lan);

        return inService.getEditMessageText(message.getChatId().toString(),
                text,
                message.getMessageId(),
                inlineKeyboardMarkup);
    }

    public EditMessageText getManagementMenuEdit(Update update, String lan) {
        Message message = update.getCallbackQuery().getMessage();
        User user = userService.getByChatId(message.getChatId().toString());
        InlineKeyboardMarkup markup = inService.createMarkup(Arrays.asList(
                Arrays.asList(MOST, LEAST),
                Arrays.asList(user.isNotify() ? DE_NOTIFY : NOTIFY, BACK_TO_MENU)
        ), lan);
        return inService.getEditMessageText(message.getChatId().toString(),
                lanService.getWord(SELECT_ACTION, lan),
                message.getMessageId(),
                markup);
    }

    public SendMessage getManagementMenuSend(Update update, String lan) {
        Message message =getMessage(update);
        User user = userService.getByChatId(message.getChatId().toString());
        InlineKeyboardMarkup markup = inService.createMarkup(Arrays.asList(
                Arrays.asList(MOST, LEAST),
                Arrays.asList(user.isNotify() ? DE_NOTIFY : NOTIFY, BACK_TO_MENU)
        ), lan);
        return inService.getSendMessage(message.getChatId().toString(),
                lanService.getWord(SELECT_ACTION, lan),
                markup);
    }

    public EditMessageText giveMostRateEdit(Update update, String lan) {
        Message message =getMessage(update);
        User user = userService.getByChatId(message.getChatId().toString());
        String text = lanService.getWord(MOST_TEXT, lan) + "<b>" + user.getMaxRate() + " $" + "</b>" +
                "\n" +
                lanService.getWord(WRITE_TO_CHANGE, lan);

        EditMessageText editMessageText = inService.getEditMessageText(message.getChatId().toString(),
                text,
                message.getMessageId(),
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_MANAGEMENT)), lan));
        editMessageText.setParseMode(ParseMode.HTML);

        return editMessageText;
    }

    public SendMessage giveMostRateSend(Update update, String lan) {
        Message message =getMessage(update);
        User user = userService.getByChatId(message.getChatId().toString());
        String text = lanService.getWord(MOST_TEXT, lan) + "<b>" + user.getMaxRate() + " $" + "</b>" +
                "\n" +
                lanService.getWord(WRITE_TO_CHANGE, lan);

        SendMessage sendMessage = inService.getSendMessage(message.getChatId().toString(),
                text,
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_MANAGEMENT)), lan));
        sendMessage.setParseMode(ParseMode.HTML);

        return sendMessage;
    }

    public EditMessageText giveLeastRateEdit(Update update, String lan) {
        Message message = getMessage(update);
        User user = userService.getByChatId(message.getChatId().toString());
        String text = lanService.getWord(LEAST_TEXT, lan) + "<b>" + user.getMinRate() + " $" + "</b>" +
                "\n" +
                lanService.getWord(WRITE_TO_CHANGE, lan);

        EditMessageText editMessageText = inService.getEditMessageText(message.getChatId().toString(),
                text,
                message.getMessageId(),
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_MANAGEMENT)), lan));
        editMessageText.setParseMode(ParseMode.HTML);
        return editMessageText;
    }

    public SendMessage giveLeastRateSend(Update update, String lan) {
        Message message = getMessage(update);
        User user = userService.getByChatId(message.getChatId().toString());
        String text = lanService.getWord(LEAST_TEXT, lan) + "<b>" + user.getMinRate() + " $" + "</b>" +
                "\n" +
                lanService.getWord(WRITE_TO_CHANGE, lan);

        SendMessage sendMessage = inService.getSendMessage(message.getChatId().toString(),
                text,
                inService.createMarkup(Collections.singletonList(Collections.singletonList(BACK_TO_MANAGEMENT)), lan));
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;
    }

    public SendMessage getSuccess(Update update, String lan) {
        Message message = update.hasMessage() ? update.getMessage() : update.getCallbackQuery().getMessage();
        return new SendMessage(message.getChatId().toString(), lanService.getWord(SUCCESS, lan));
    }

    public List<SendMessage> getNotification(Map<String, List<String>> messages) {
        List<SendMessage> messageList = new ArrayList<>();
        for (String chatId : messages.keySet())
            for (String text : messages.get(chatId))
                messageList.add(inService.getSendMessage(chatId,text,
                        inService.createMarkup(Collections.singletonList(Collections.singletonList(STOP)), EN)));
        return messageList;
    }


    private Message getMessage(Update update) {
        return update.hasMessage() ? update.getMessage() : update.getCallbackQuery().getMessage();
    }

}






