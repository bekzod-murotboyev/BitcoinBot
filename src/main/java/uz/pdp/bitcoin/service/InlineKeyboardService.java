package uz.pdp.bitcoin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

import static uz.pdp.bitcoin.util.Constant.BACK;

@Service
@RequiredArgsConstructor
public class InlineKeyboardService {

    private final LanguageService lanService;

    public InlineKeyboardMarkup createMarkup(List<List<String>> rows, String lan) {
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        for (List<String> row : rows) {
            List<InlineKeyboardButton> dRow = new ArrayList<>();
            for (String word : row) {
                InlineKeyboardButton button;
                if (!word.contains("BACK")) {
                    button = new InlineKeyboardButton(lanService.getWord(word, lan));
                    button.setCallbackData(word);
                } else {
                    button = new InlineKeyboardButton(lanService.getWord(BACK, lan));
                    button.setCallbackData(word);
                }
                dRow.add(button);
            }
            rowList.add(dRow);
        }

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardButton getBtn(String callBackData, String text) {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton(text);
        inlineKeyboardButton.setCallbackData(callBackData);
        return inlineKeyboardButton;
    }

    public SendMessage getSendMessage(String chatId, String text, InlineKeyboardMarkup inlineKeyboardMarkup) {
        SendMessage sendMessage = new SendMessage(chatId, text);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public EditMessageText getEditMessageText(String chatId, String text, Integer messageId, InlineKeyboardMarkup inlineKeyboardMarkup) {
        EditMessageText editMessageText = new EditMessageText(text);
        editMessageText.setChatId(chatId);
        editMessageText.setMessageId(messageId);
        editMessageText.setReplyMarkup(inlineKeyboardMarkup);
        return editMessageText;
    }
}
