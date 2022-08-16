package uz.pdp.bitcoin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import uz.pdp.bitcoin.config.SwaggerConfig;
import uz.pdp.bitcoin.config.WebConfig;

@EnableFeignClients
@SpringBootApplication
@EnableJpaRepositories(value = "uz.pdp.bitcoin")
@EntityScan(value = "uz.pdp.bitcoin.entity")
@EnableSwagger2
@Import({SwaggerConfig.class , WebConfig.class})
public class BitcoinBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(BitcoinBotApplication.class, args);
    }
}
