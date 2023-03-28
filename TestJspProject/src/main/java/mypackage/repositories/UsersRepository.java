package mypackage.repositories;

import mypackage.models.User;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    void save(User user);
    boolean isExist(String firstName, String password);
}
