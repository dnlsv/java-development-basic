package org.example.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {
    Optional<T> read(int id);
    void create(T model);
    void update(T model);
    void delete(int id);

    List<T> findAll();
}
