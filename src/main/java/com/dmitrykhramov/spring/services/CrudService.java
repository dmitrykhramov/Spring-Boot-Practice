package com.dmitrykhramov.spring.services;


import java.util.List;

/**
 * Created by Dmitry on 29.12.2016.
 */

public interface CrudService<T> {

    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);

}
