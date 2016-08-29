package basic.dao;

import java.util.List;

public interface BaseDao<T> {

    T getById(int id);

    List<T> getAll();

    void save(T entity);

    void delete(T entity);
}
