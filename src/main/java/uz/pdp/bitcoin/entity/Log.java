package uz.pdp.bitcoin.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.bitcoin.entity.base.BaseEntity;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Log extends BaseEntity {
    String message;

    String fromChatId;

    String state;
}
