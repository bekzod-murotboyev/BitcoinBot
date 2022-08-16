package uz.pdp.bitcoin.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private String chatId;

    private String name;

    private String username;

    private String botState;

    private double money;

    private double bitcoin;

    private String language;
}
