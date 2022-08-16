package uz.pdp.bitcoin.bot;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.pdp.bitcoin.payload.FirstDTO;
import uz.pdp.bitcoin.service.LogService;
import uz.pdp.bitcoin.service.TelegramBot;
import uz.pdp.bitcoin.service.UserService;
import uz.pdp.bitcoin.util.BotState;
import uz.pdp.bitcoin.util.Constant;
import uz.pdp.bitcoin.util.Url;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Component
@RequiredArgsConstructor
public class BitcoinBot extends TelegramLongPollingBot implements Constant {

    private final TelegramBot telegramBot;

    private final UserService userService;

    private final LogService logService;

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        doJob(update);
    }

    public void doJob(Update update) throws TelegramApiException, IOException {
        String state, language;
        if (update.hasMessage() || update.hasCallbackQuery()) {
            FirstDTO lanAndState = userService.getAndCheck(update);
            state = lanAndState.getBotState();
            language = lanAndState.getLanguage();

            if (update.hasMessage()) {
                Message message = update.getMessage();
                if (message.hasText()) {
                    String text = message.getText();
                    if (text.equals(START)) {
                        if (!state.equals(BotState.CHANGE_LANGUAGE_SEND)) {
                            state = BotState.MENU_SEND;
                        }
                    } else if (state.equals(BotState.INVESTMENT_EDIT) || state.equals(BotState.INVESTMENT_SEND)) {
                        try {
                            double money = Double.parseDouble(text);
                            if(money>0){
                                userService.changeMoney(update, money);
                                state = BotState.BITCOIN;
                            }else
                                state = BotState.INVESTMENT_SEND;

                        } catch (Exception e) {
                            logService.save(e.getMessage(),message.getChatId().toString(),state);
                            state = BotState.INVESTMENT_SEND;
                        }
                    } else if (state.equals(BotState.BITCOIN)) {
                        try {
                            double bitcoin = Double.parseDouble(text);
                            if(bitcoin>0){
                                userService.changeBitcoin(update, bitcoin);
                                state = BotState.PROFIT;
                            }else
                                state=BotState.BITCOIN;
                        } catch (Exception e) {
                            logService.save(e.getMessage(),message.getChatId().toString(),state);
                            state=BotState.BITCOIN;
                        }
                    } else if (state.equals(BotState.GIVE_MOST_SEND) || state.equals(BotState.GIVE_MOST_EDIT)) {
                        try {
                            double maxPrice = Double.parseDouble(text);
                            userService.changeMaxRate(update, maxPrice);
                            execute(telegramBot.getSuccess(update, language));
                            state = BotState.MANAGEMENT_SEND;
                        } catch (Exception e) {
                            logService.save(e.getMessage(),message.getChatId().toString(),state);
                            state=BotState.GIVE_MOST_SEND;
                        }
                    } else if (state.equals(BotState.GIVE_LEAST_SEND)||state.equals(BotState.GIVE_LEAST_EDIT)) {
                        try {
                            double minPrice = Double.parseDouble(text);
                            userService.changeMinRate(update, minPrice);
                            execute(telegramBot.getSuccess(update, language));
                            state = BotState.MANAGEMENT_SEND;
                        } catch (Exception e) {
                            logService.save(e.getMessage(),message.getChatId().toString(),state);
                            state=BotState.GIVE_LEAST_SEND;
                        }
                    } else {
                        execute(telegramBot.setError(update));
                        state = BotState.MENU_SEND;
                    }
                }
            } else if (update.hasCallbackQuery()) {
                String data = update.getCallbackQuery().getData();
                switch (data) {
                    case UZ:
                        language = UZ;
                        state = BotState.MENU_EDIT;
                        break;
                    case RU:
                        language = RU;
                        state = BotState.MENU_EDIT;
                        break;
                    case EN:
                        language = EN;
                        state = BotState.MENU_EDIT;
                        break;
                    case BACK_TO_BALANCE:
                    case BALANCE:
                        state = BotState.BALANCE;
                        break;
                    case BACK_TO_STATISTICS:
                    case STATISTICS:
                        state = BotState.STATISTICS;
                        break;
                    case LAST_ONE_HOUR:
                        state = BotState.LAST_ONE;
                        break;
                    case LAST_ONE_DAY:
                        state = BotState.LAST_24;
                        break;
                    case ALL_TIME:
                        state = BotState.ALL_TIME;
                        break;
                    case HIGH:
                        state = BotState.HIGH;
                        break;
                    case LOW:
                        state = BotState.LOW;
                        break;
                    case PROFIT:
                        state = BotState.INVESTMENT_EDIT;
                        break;
                    case SETTINGS:
                        state = BotState.SETTINGS;
                        break;
                    case BACK_TO_MANAGEMENT:
                    case MANAGEMENT:
                        state = BotState.MANAGEMENT_EDIT;
                        break;
                    case CHANGE_LANGUAGE:
                        state = BotState.CHANGE_LANGUAGE_EDIT;
                        break;
                    case BACK_TO_MENU:
                        state = BotState.MENU_EDIT;
                        break;
                    case MOST:
                        state = BotState.GIVE_MOST_EDIT;
                        break;
                    case LEAST:
                        state = BotState.GIVE_LEAST_EDIT;
                        break;
                    case STOP:
                        state = BotState.STOP_NOTIFICATION;
                        break;
                    case NOTIFY:
                    case DE_NOTIFY: {
                        userService.changeNotify(update);
                        state = BotState.MANAGEMENT_EDIT;
                    }
                }
            }

            switch (state) {
                case BotState.CHANGE_LANGUAGE_SEND:
                    execute(telegramBot.changeLanguageSend(update));
                    break;
                case BotState.CHANGE_LANGUAGE_EDIT:
                    execute(telegramBot.changeLanguageEdit(update, language));
                    break;
                case BotState.MENU_SEND:
                    execute(telegramBot.getSendMessageMenu(update, language));
                    break;
                case BotState.MENU_EDIT:
                    execute(telegramBot.getEditMessageMenu(update, language));
                    break;
                case BotState.BALANCE:
                    execute(telegramBot.getBalance(update, language));
                    break;
                case BotState.STATISTICS:
                    execute(telegramBot.getMenuStatistics(update, language));
                    break;
                case BotState.SETTINGS:
                    execute(telegramBot.getSettings(update, language));
                    break;
                case BotState.LAST_ONE:
                    execute(telegramBot.getLastOneHour(update, language));
                    break;
                case BotState.LAST_24:
                    execute(telegramBot.getLastOneDay(update, language));
                    break;
                case BotState.ALL_TIME:
                    execute(telegramBot.getMenuAllTime(update, language));
                    break;
                case BotState.HIGH:
                    execute(telegramBot.getAllHigh(update, language));
                    break;
                case BotState.LOW:
                    execute(telegramBot.getAllLow(update, language));
                    break;
                case BotState.INVESTMENT_EDIT:
                    execute(telegramBot.getInvestmentEdit(update, language));
                    break;
                case BotState.INVESTMENT_SEND:
                    execute(telegramBot.getInvestmentSend(update, language));
                    break;
                case BotState.BITCOIN:
                    execute(telegramBot.getSendBitcoin(update, language));
                    break;
                case BotState.PROFIT:
                    execute(telegramBot.getProfit(update, language));
                    break;
                case BotState.MANAGEMENT_EDIT:
                    execute(telegramBot.getManagementMenuEdit(update, language));
                    break;
                case BotState.MANAGEMENT_SEND:
                    execute(telegramBot.getManagementMenuSend(update, language));
                    break;
                case BotState.GIVE_MOST_EDIT:
                    execute(telegramBot.giveMostRateEdit(update, language));
                    break;
                case BotState.GIVE_MOST_SEND:
                    execute(telegramBot.giveMostRateSend(update, language));
                    break;
                case BotState.GIVE_LEAST_EDIT:
                    execute(telegramBot.giveLeastRateEdit(update, language));
                    break;
                case BotState.GIVE_LEAST_SEND:
                    execute(telegramBot.giveLeastRateSend(update, language));
                    break;
                case BotState.STOP_NOTIFICATION: {
                    userService.changeNotify(update);
                    execute(telegramBot.getEditMessageMenu(update, language));
                }
            }
            userService.changeLanAndState(update, new FirstDTO(state, language));
        }
    }

    public void sendNotification(Map<String, List<String>> notifications) throws TelegramApiException {
        if (notifications.size() < 10) {
            for (SendMessage sendMessage : telegramBot.getNotification(notifications))
                execute(sendMessage);
        } else {
            ExecutorService threadPool = Executors.newCachedThreadPool();
            for (SendMessage sendMessage : telegramBot.getNotification(notifications))
                threadPool.execute(() -> {
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        logService.save(e.getMessage(),sendMessage.getChatId(),BotState.DYNAMIC_NOTIFICATION);
                        e.printStackTrace();
                    }
                });
        }
    }


    @Override
    public String getBotUsername() {
        return Url.USERNAME;
    }

    @Override
    public String getBotToken() {
        return Url.TOKEN;
    }

}
