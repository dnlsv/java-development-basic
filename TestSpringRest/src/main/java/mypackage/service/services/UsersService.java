package mypackage.service.services;

import mypackage.service.forms.UserForm;
import mypackage.service.models.User;

import java.util.List;

public interface UsersService {
    void signUp (UserForm userForm);

    List<User> findAll();

    User findOneById(int userId);
}
