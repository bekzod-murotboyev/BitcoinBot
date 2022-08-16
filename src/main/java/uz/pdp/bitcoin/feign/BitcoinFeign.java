package uz.pdp.bitcoin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import uz.pdp.bitcoin.model.bitcoin.Response;

import static uz.pdp.bitcoin.util.Url.BITCOIN_URL;

@FeignClient(url = BITCOIN_URL,name = "BitcoinFeign")
public interface BitcoinFeign {

    @GetMapping
    Response getData();
}
