package uz.pdp.bitcoin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.bitcoin.entity.Log;
import uz.pdp.bitcoin.entity.Owner;

import java.util.Optional;

public interface LogRepository extends JpaRepository<Log,Long> {

}
