package uz.pdp.bitcoin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.bitcoin.entity.Owner;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner,Long> {

    Optional<Owner> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByMail(String mail);
    Optional<Owner> findByMail(String mail);
}
