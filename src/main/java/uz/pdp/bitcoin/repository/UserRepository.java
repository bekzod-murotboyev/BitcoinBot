package uz.pdp.bitcoin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.bitcoin.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByChatId(String chatId);

    boolean existsByChatId(String chatId);

    User findByUsername(String username);

}
