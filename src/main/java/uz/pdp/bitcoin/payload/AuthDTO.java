package uz.pdp.bitcoin.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthDTO {
    private String botState;

    private double money;

    private double bitcoin;

    private String language;
}
