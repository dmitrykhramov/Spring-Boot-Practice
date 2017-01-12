package com.dmitrykhramov.spring.repositories;

import com.dmitrykhramov.spring.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dmitry on 09.01.2017.
 */

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
