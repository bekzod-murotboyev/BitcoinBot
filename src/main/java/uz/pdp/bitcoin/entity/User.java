package uz.pdp.bitcoin.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.bitcoin.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    String chatId;

    @Column(unique = true)
    String username;

    String name;

    String botState;

    double money;

    double bitcoin;

    String language;

    double minRate;

    double maxRate;

    boolean notify;
}
