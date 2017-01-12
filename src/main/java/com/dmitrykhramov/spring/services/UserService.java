package com.dmitrykhramov.spring.services;

import com.dmitrykhramov.spring.domain.User;

/**
 * Created by Dmitry on 09.01.2017.
 */

public interface UserService extends CrudService<User> {

    User findByUserName(String userName);
}
