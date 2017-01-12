package com.dmitrykhramov.spring.repositories;

import com.dmitrykhramov.spring.domain.Product;
import com.dmitrykhramov.spring.services.CrudService;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dmitry on 09.01.2017.
 */

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
