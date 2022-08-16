package uz.pdp.bitcoin.component;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import uz.pdp.bitcoin.service.LogService;
import uz.pdp.bitcoin.util.BotState;

@Component
@RequiredArgsConstructor
public class EmailComponent {


    private final JavaMailSender javaMailSender;

    private final LogService logService;

    public boolean sendToRegistration(String mail,String code){
        try {
            SimpleMailMessage message=new SimpleMailMessage();
            message.setFrom(mail);
            message.setTo("bekzod.m070@gmail.com");
            message.setSubject("Please register");
            message.setText(mail+" is want to register to your BitcoinBot\nCode: "+code);
            javaMailSender.send(message);
            return true;
        }catch (Exception e){
            logService.save(e.getMessage(),mail, BotState.SEND_MAIL_MESSAGE);
            return false;
        }
    }
}
