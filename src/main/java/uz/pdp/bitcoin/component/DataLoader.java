package uz.pdp.bitcoin.component;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uz.pdp.bitcoin.bot.BitcoinBot;
import uz.pdp.bitcoin.entity.Owner;
import uz.pdp.bitcoin.repository.OwnerRepository;
import uz.pdp.bitcoin.service.TelegramBot;
import uz.pdp.bitcoin.service.UserService;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    @Value("${spring.sql.init.mode}")
    String initMode;
    private final OwnerRepository ownerRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public void run(String... args) {
        if (initMode.equals("always")) {
            Owner owner = new Owner();
            owner.setUsername("bekdev");
            owner.setPassword(passwordEncoder.encode("5939523"));
            owner.setMail("bekzod.m070@gmail.com");
            owner.setEnabled(true);
            ownerRepository.save(owner);
        }
    }
}
