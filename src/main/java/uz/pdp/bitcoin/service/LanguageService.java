package uz.pdp.bitcoin.service;

import org.springframework.stereotype.Service;
import uz.pdp.bitcoin.util.Constant;

@Service
public class LanguageService implements Constant {
    public String getWord(String word, String language) {
        switch (language) {
            case EN:
                return getEnWord(word);
            case RU:
                return getRuWord(word);
            case UZ:
                return getUzWord(word);
            default:
                return "";
        }
    }

    private String getEnWord(String word) {
        switch (word) {
            case MENU_TEXT:
                return MENU_TEXT;
            case BALANCE:
                return BALANCE;
            case SETTINGS:
                return SETTINGS;
            case MANAGEMENT:
                return MANAGEMENT;
            case SELECT_ACTION:
                return SELECT_ACTION;
            case STATISTICS:
                return STATISTICS;
            case LAST_ONE_HOUR:
                return LAST_ONE_HOUR;
            case LAST_ONE_DAY:
                return LAST_ONE_DAY;
            case OPEN:
                return OPEN;
            case MAX:
                return MAX;
            case MIN:
                return MIN;
            case CLOSE:
                return CLOSE;
            case ALL_TIME:
                return ALL_TIME;
            case DAY:
                return DAY;
            case HIGH:
                return HIGH;
            case LOW:
                return LOW;
            case PRICE:
                return PRICE;
            case DATE:
                return DATE;
            case PERCENT:
                return PERCENT;
            case PAST_TENSE:
                return PAST_TENSE;
            case SUCCESS:return SUCCESS;
            case MAX_NOTIFICATION_TEXT:return MAX_NOTIFICATION_TEXT;
            case MIN_NOTIFICATION_TEXT:return MIN_NOTIFICATION_TEXT;
            case STOP:return STOP;
            case NOTIFY:return NOTIFY;
            case DE_NOTIFY:return DE_NOTIFY;
            case CURRENT_PRICE:return CURRENT_PRICE;
            case LEAST:
                return LEAST;
            case MOST:
                return MOST;
            case MOST_TEXT:
                return MOST_TEXT;
            case LEAST_TEXT:
                return LEAST_TEXT;
            case WRITE_TO_CHANGE:
                return WRITE_TO_CHANGE;
            case NEW:
                return NEW;
            case PROFIT:
                return PROFIT;
            case CHANGE_LANGUAGE_TEXT:
                return CHANGE_LANGUAGE_TEXT;
            case MENU:
                return MENU;
            case BACK:
                return BACK;
            case USD_PROFIT_TEXT:
                return USD_PROFIT_TEXT;
            case CHANGE_LANGUAGE:
                return CHANGE_LANGUAGE;
            case UZS_PROFIT_TEXT:
                return UZS_PROFIT_TEXT;
            case RUB_PROFIT_TEXT:
                return RUB_PROFIT_TEXT;
            case INVESTMENT_TEXT:
                return INVESTMENT_TEXT;
            case BITCOIN_TEXT:
                return BITCOIN_TEXT;
            case SOUM:
                return SOUM;
            case RUBLE:
                return RUBLE;
            case WAIT:
                return WAIT;
            default:
                return ERROR;
        }
    }

    private String getRuWord(String word) {
        switch (word) {
            case MENU_TEXT:
                return MENU_TEXT_RU;
            case BALANCE:
                return BALANCE_RU;
            case SETTINGS:
                return SETTINGS_RU;
            case MANAGEMENT:
                return MANAGEMENT_RU;
            case SELECT_ACTION:
                return SELECT_ACTION_RU;
            case SUCCESS:return SUCCESS_RU;
            case STATISTICS:
                return STATISTICS_RU;
            case LAST_ONE_HOUR:
                return LAST_ONE_HOUR_RU;
            case LAST_ONE_DAY:
                return LAST_ONE_DAY_RU;
            case OPEN:
                return OPEN_RU;
            case MAX:
                return MAX_RU;
            case MIN:
                return MIN_RU;
            case CLOSE:
                return CLOSE_RU;
            case ALL_TIME:
                return ALL_TIME_RU;
            case DAY:
                return DAY_RU;
            case HIGH:
                return HIGH_RU;
            case LOW:
                return LOW_RU;
            case PRICE:
                return PRICE_RU;
            case DATE:
                return DATE_RU;
            case PERCENT:
                return PERCENT_RU;
            case PAST_TENSE:
                return PAST_TENSE_RU;
            case MAX_NOTIFICATION_TEXT:return MAX_NOTIFICATION_TEXT_RU;
            case MIN_NOTIFICATION_TEXT:return MIN_NOTIFICATION_TEXT_RU;
            case STOP:return STOP;
            case NOTIFY:return NOTIFY_RU;
            case DE_NOTIFY:return DE_NOTIFY_RU;
            case CURRENT_PRICE:return CURRENT_PRICE_RU;
            case LEAST:
                return LEAST_RU;
            case MOST:
                return MOST_RU;
            case MOST_TEXT:
                return MOST_TEXT_RU;
            case LEAST_TEXT:
                return LEAST_TEXT_RU;
            case WRITE_TO_CHANGE:
                return WRITE_TO_CHANGE_RU;
            case NEW:
                return NEW_RU;
            case PROFIT:
                return PROFIT_RU;
            case CHANGE_LANGUAGE_TEXT:
                return CHANGE_LANGUAGE_TEXT_RU;
            case MENU:
                return MENU_RU;
            case BACK:
                return BACK_RU;
            case USD_PROFIT_TEXT:
                return USD_PROFIT_TEXT_RU;
            case UZS_PROFIT_TEXT:
                return UZS_PROFIT_TEXT_RU;
            case RUB_PROFIT_TEXT:
                return RUB_PROFIT_TEXT_RU;
            case CHANGE_LANGUAGE:
                return CHANGE_LANGUAGE_RU;
            case INVESTMENT_TEXT:
                return INVESTMENT_TEXT_RU;
            case BITCOIN_TEXT:
                return BITCOIN_TEXT_RU;
            case SOUM:
                return SOUM_RU;
            case RUBLE:
                return RUBLE_RU;
            case WAIT:
                return WAIT_RU;
            default:
                return ERROR;
        }
    }

    private String getUzWord(String word) {
        switch (word) {
            case MENU_TEXT:
                return MENU_TEXT_UZ;
            case BALANCE:
                return BALANCE_UZ;
            case SETTINGS:
                return SETTINGS_UZ;
            case MANAGEMENT:
                return MANAGEMENT_UZ;
            case SELECT_ACTION:
                return SELECT_ACTION_UZ;
            case SUCCESS:return SUCCESS_UZ;
            case STATISTICS:
                return STATISTICS_UZ;
            case LAST_ONE_HOUR:
                return LAST_ONE_HOUR_UZ;
            case LAST_ONE_DAY:
                return LAST_ONE_DAY_UZ;
            case OPEN:
                return OPEN_UZ;
            case MAX:
                return MAX_UZ;
            case MIN:
                return MIN_UZ;
            case CLOSE:
                return CLOSE_UZ;
            case ALL_TIME:
                return ALL_TIME_UZ;
            case DAY:
                return DAY_UZ;
            case HIGH:
                return HIGH_UZ;
            case LOW:
                return LOW_UZ;
            case PRICE:
                return PRICE_UZ;
            case DATE:
                return DATE_UZ;
            case PERCENT:
                return PERCENT_UZ;
            case PAST_TENSE:
                return PAST_TENSE_UZ;
            case LEAST:
                return LEAST_UZ;
            case MOST:
                return MOST_UZ;
            case MOST_TEXT:
                return MOST_TEXT_UZ;
            case LEAST_TEXT:
                return LEAST_TEXT_UZ;
            case WRITE_TO_CHANGE:
                return WRITE_TO_CHANGE_UZ;
            case MAX_NOTIFICATION_TEXT:return MAX_NOTIFICATION_TEXT_UZ;
            case MIN_NOTIFICATION_TEXT:return MIN_NOTIFICATION_TEXT_UZ;
            case STOP:return STOP;
            case NOTIFY:return NOTIFY_UZ;
            case DE_NOTIFY:return DE_NOTIFY_UZ;
            case CURRENT_PRICE:return CURRENT_PRICE_UZ;

            case NEW:
                return NEW_UZ;
            case PROFIT:
                return PROFIT_UZ;
            case CHANGE_LANGUAGE_TEXT:
                return CHANGE_LANGUAGE_TEXT_UZ;
            case MENU:
                return MENU_UZ;
            case BACK:
                return BACK_UZ;
            case USD_PROFIT_TEXT:
                return USD_PROFIT_TEXT_UZ;
            case UZS_PROFIT_TEXT:
                return UZS_PROFIT_TEXT_UZ;
            case RUB_PROFIT_TEXT:
                return RUB_PROFIT_TEXT_UZ;
            case CHANGE_LANGUAGE:
                return CHANGE_LANGUAGE_UZ;
            case INVESTMENT_TEXT:
                return INVESTMENT_TEXT_UZ;
            case BITCOIN_TEXT:
                return BITCOIN_TEXT_UZ;
            case SOUM:
                return SOUM_UZ;
            case RUBLE:
                return RUBLE_UZ;
            case WAIT:
                return WAIT_UZ;
            default:
                return ERROR;
        }
    }


}
