package uz.pdp.bitcoin.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import uz.pdp.bitcoin.model.bank.Bank;
import uz.pdp.bitcoin.model.bank.BankItem;
import uz.pdp.bitcoin.util.Url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {

    private final ObjectMapper objectMapper;

    public BankItem[] getData() throws IOException {
        HttpGet httpGet = new HttpGet(Url.BANK_URL);
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = client.execute(httpGet);
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        return objectMapper.readValue(reader, BankItem[].class);
    }
}
