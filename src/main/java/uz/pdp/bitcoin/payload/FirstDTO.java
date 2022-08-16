package uz.pdp.bitcoin.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FirstDTO {
    private String botState;

    private String language;
}
