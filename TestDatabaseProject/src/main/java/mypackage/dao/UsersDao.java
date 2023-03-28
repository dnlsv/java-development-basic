package mypackage.dao;

import mypackage.models.User;

import java.util.List;

public interface UsersDao extends CrudDao<User>{
    List<User> findAllByFirstName(String firstName);
}
