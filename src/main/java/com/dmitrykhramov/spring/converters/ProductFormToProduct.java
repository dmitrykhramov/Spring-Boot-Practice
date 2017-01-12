package com.dmitrykhramov.spring.converters;

import com.dmitrykhramov.spring.commands.ProductForm;
import com.dmitrykhramov.spring.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by Dmitry on 10.01.2017.
 */

@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        product.setId(productForm.getId());
        product.setVersion(productForm.getVersion());
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());
        return product;
    }
}