package uz.pdp.bitcoin.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import uz.pdp.bitcoin.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Owner extends BaseEntity implements UserDetails {

    @Column(unique = true, nullable = false)
    String username;

    @Column(unique = true, nullable = false)
    String mail;

    String password;

    String emailCode;


    boolean enabled = false;
    boolean credentialsNonExpired = true;
    boolean accountNonLocked = true;
    boolean accountNonExpired = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
}
