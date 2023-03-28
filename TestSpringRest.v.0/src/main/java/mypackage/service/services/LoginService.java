package mypackage.service.services;

import mypackage.service.forms.LoginForm;
import mypackage.service.transfer.TokenDto;

public interface LoginService {

    TokenDto login(LoginForm loginForm);
}
