package org.example.service.repositories;

import org.example.service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findAllByFirstName(String firstName);

    Optional<User> findOneByLogin(String login);
}
