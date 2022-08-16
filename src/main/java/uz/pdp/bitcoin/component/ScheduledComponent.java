package uz.pdp.bitcoin.component;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.pdp.bitcoin.bot.BitcoinBot;
import uz.pdp.bitcoin.entity.User;
import uz.pdp.bitcoin.feign.BitcoinFeign;
import uz.pdp.bitcoin.service.LanguageService;
import uz.pdp.bitcoin.service.UserService;

import java.util.*;

import static uz.pdp.bitcoin.util.Constant.*;

@EnableScheduling
@Component
@RequiredArgsConstructor
public class ScheduledComponent{

    private final BitcoinBot bitcoinBot;

    private final UserService userService;

    private final BitcoinFeign bitcoinFeign;

    private final LanguageService languageService;

    @Scheduled(fixedRate = 60_000)
    public void sendMessageList() throws TelegramApiException {
        double priceUsd = bitcoinFeign.getData().getData().getMarketData().getPriceUsd();
        priceUsd=(double) Math.round(priceUsd * 100) / 100;
        Map<String, List<String>> notifications = new HashMap<>();
        for (User user : userService.getAll()) {
            if (user.getMinRate() >= priceUsd && user.isNotify())
                notifications.put(user.getChatId(),
                        new ArrayList<>(Collections.singletonList(languageService.getWord(CURRENT_PRICE, user.getLanguage())+priceUsd+" $\n"
                                + (user.getLanguage().equals(UZ) ?
                                (user.getMinRate()+" $" + MIN_NOTIFICATION_TEXT_UZ) :
                                languageService.getWord(MIN_NOTIFICATION_TEXT, user.getLanguage()) + user.getMinRate()+" $"))));

            if (user.getMaxRate() <= priceUsd && user.isNotify())
                if (!notifications.containsKey(user.getChatId())) {
                    notifications.put(user.getChatId(),
                            new ArrayList<>(Collections.singletonList(languageService.getWord(CURRENT_PRICE, user.getLanguage())+priceUsd+" $\n"+
                                    (user.getLanguage().equals(UZ) ?
                                    (user.getMaxRate() + MAX_NOTIFICATION_TEXT_UZ) :
                                    languageService.getWord(MAX_NOTIFICATION_TEXT, user.getLanguage()) + user.getMaxRate()))));
                } else {
                    List<String> list = notifications.get(user.getChatId());
                    list.add(languageService.getWord(CURRENT_PRICE, user.getLanguage())+priceUsd+" $\n"+
                            (user.getLanguage().equals(UZ) ?
                            (user.getMaxRate()+" $" + MAX_NOTIFICATION_TEXT_UZ) :
                            languageService.getWord(MAX_NOTIFICATION_TEXT, user.getLanguage()) + user.getMaxRate()+" $"));
                    notifications.put(user.getChatId(), list);
                }
        }
        if (!notifications.isEmpty())
            bitcoinBot.sendNotification(notifications);
    }
}
