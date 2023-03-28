package mypackage.mvc.dao;

import mypackage.mvc.models.User;

import java.util.List;

public interface UsersDao extends CrudDao<User>{
    List<User> findAllByFirstName(String firstName);
}
