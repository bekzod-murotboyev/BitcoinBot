package uz.pdp.bitcoin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.pdp.bitcoin.entity.User;
import uz.pdp.bitcoin.payload.FirstDTO;
import uz.pdp.bitcoin.payload.SecondDTO;
import uz.pdp.bitcoin.payload.UserDTO;
import uz.pdp.bitcoin.repository.UserRepository;
import uz.pdp.bitcoin.util.BotState;
import uz.pdp.bitcoin.util.Constant;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public FirstDTO getAndCheck(Update update) {
        User user;
        Message message =getMessage(update);
        String chatId = message.getChatId().toString();
        if (userRepository.existsByChatId(chatId)) {
            user = userRepository.findByChatId(chatId);
        } else {
            user = addUser(new UserDTO(
                    chatId,
                    message.getFrom().getFirstName(),
                    message.getFrom().getUserName(),
                    BotState.CHANGE_LANGUAGE_SEND,
                    0,
                    0,
                    Constant.EN
            ));
        }
        return new FirstDTO(
                user.getBotState(),
                user.getLanguage()
        );
    }

    public SecondDTO getAmount(Update update) {
        Message message =getMessage(update);
        User user = userRepository.findByChatId(message.getChatId().toString());
        return new SecondDTO(
                user.getMoney(),
                user.getBitcoin()
        );
    }

    public User addUser(UserDTO userDTO) {
        User user = new User();
        user.setChatId(userDTO.getChatId());
        if (userDTO.getUsername() == null) {
            user.setUsername("");
        } else {
            user.setUsername(userDTO.getUsername());
        }
        user.setName(userDTO.getName());
        user.setMoney(userDTO.getMoney());
        user.setBitcoin(userDTO.getBitcoin());
        user.setBotState(userDTO.getBotState());
        user.setLanguage(userDTO.getLanguage());
        return userRepository.save(user);
    }

    public void changeLanAndState(Update update, FirstDTO firstDTO) {
        Message message =getMessage(update);
        User user = userRepository.findByChatId(message.getChatId().toString());
        user.setBotState(firstDTO.getBotState());
        user.setLanguage(firstDTO.getLanguage());
        userRepository.save(user);
    }

    public void changeMoney(Update update, double money) {
        Message message =getMessage(update);
        User user = userRepository.findByChatId(message.getChatId().toString());
        user.setMoney(money);
        userRepository.save(user);
    }

    public void changeBitcoin(Update update, double bitcoin) {
        Message message =getMessage(update);
        User user = userRepository.findByChatId(message.getChatId().toString());
        user.setBitcoin(bitcoin);
        userRepository.save(user);
    }

    public User getByChatId(String chatId) {
        return userRepository.findByChatId(chatId);
    }

    public void changeMaxRate(Update update, double maxPrice) {
        Message message =getMessage(update);
        User user = userRepository.findByChatId(message.getChatId().toString());
        user.setMaxRate(maxPrice);
        userRepository.save(user);
    }

    public void changeMinRate(Update update, double minPrice) {
        Message message =getMessage(update);
        User user = userRepository.findByChatId(message.getChatId().toString());
        user.setMinRate(minPrice);
        userRepository.save(user);
    }

    public void changeNotify(Update update) {
        Message message =getMessage(update);
        User user = userRepository.findByChatId(message.getChatId().toString());
        user.setNotify(!user.isNotify());
        userRepository.save(user);
    }

    private Message getMessage(Update update) {
        return update.hasMessage() ? update.getMessage() : update.getCallbackQuery().getMessage();
    }

}
