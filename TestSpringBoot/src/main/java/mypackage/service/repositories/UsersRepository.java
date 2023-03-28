package mypackage.service.repositories;

import mypackage.service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findAllByFirstName(String firstName);

    Optional<User> findOneByLogin(String login);
}
