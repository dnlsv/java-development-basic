package org.example.service.services;

import org.example.service.forms.UserForm;
import org.example.service.models.User;

import java.util.List;

public interface UsersService {
    void signUp (UserForm userForm);

    List<User> findAll();

    User findOneById(int userId);
}
