package com.dmitrykhramov.spring.services;

import com.dmitrykhramov.spring.commands.ProductForm;
import com.dmitrykhramov.spring.domain.Product;

import java.util.List;

/**
 * Created by Dmitry on 28.12.2016.
 */

public interface ProductService extends CrudService<Product> {

    Product saveOrUpdateProductForm(ProductForm productForm);
}
