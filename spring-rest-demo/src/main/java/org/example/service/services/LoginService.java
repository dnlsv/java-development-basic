package org.example.service.services;

import org.example.service.forms.LoginForm;
import org.example.service.transfer.TokenDto;

public interface LoginService {

    TokenDto login(LoginForm loginForm);
}
