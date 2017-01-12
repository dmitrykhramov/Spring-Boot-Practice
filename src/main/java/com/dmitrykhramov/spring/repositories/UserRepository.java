package com.dmitrykhramov.spring.repositories;

import com.dmitrykhramov.spring.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dmitry on 09.01.2017.
 */

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
