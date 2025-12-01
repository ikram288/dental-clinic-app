package org.dentexa.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T, ID> {

    T save(T entity);

    T update(T entity);

    boolean deleteById(ID id);

    Optional<T> findById(ID id);

    List<T> findAll();
}
