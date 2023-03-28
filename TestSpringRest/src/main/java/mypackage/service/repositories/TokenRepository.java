package mypackage.service.repositories;

import mypackage.service.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {
    Optional<Token> findOneByValue(String value);
}
