package org.example.mvc.dao;

import org.example.mvc.models.User;

import java.util.List;

public interface UsersDao extends CrudDao<User>{
    List<User> findAllByFirstName(String firstName);
}
