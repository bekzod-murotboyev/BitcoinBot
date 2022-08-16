package uz.pdp.bitcoin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.bitcoin.entity.Log;
import uz.pdp.bitcoin.repository.LogRepository;

@Service
@RequiredArgsConstructor
public class LogService {

    private final LogRepository logRepository;

    public void save(String message,String fromChatId,String state){
        logRepository.save(new Log(message,fromChatId,state));
    }

}
