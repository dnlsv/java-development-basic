package org.example.mvc.repositories;

import org.example.mvc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findAllByFirstName(String firstName);
}
