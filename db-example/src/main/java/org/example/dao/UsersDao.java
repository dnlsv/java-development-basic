package org.example.dao;

import org.example.models.User;

import java.util.List;

public interface UsersDao extends CrudDao<User>{
    List<User> findAllByFirstName(String firstName);
}
