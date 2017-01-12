package com.dmitrykhramov.spring.repositories;

import com.dmitrykhramov.spring.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dmitry on 09.01.2017.
 */

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
