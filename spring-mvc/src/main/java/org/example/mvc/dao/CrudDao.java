package org.example.mvc.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {
    Optional<T> read(int id);
    void save(T model);
    void update(T model);
    void delete(int id);

    List<T> findAll();
}
