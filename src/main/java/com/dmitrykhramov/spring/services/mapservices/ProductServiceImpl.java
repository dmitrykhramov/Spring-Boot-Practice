package com.dmitrykhramov.spring.services.mapservices;

import com.dmitrykhramov.spring.commands.ProductForm;
import com.dmitrykhramov.spring.converters.ProductFormToProduct;
import com.dmitrykhramov.spring.domain.DomainObject;
import com.dmitrykhramov.spring.domain.Product;
import com.dmitrykhramov.spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Dmitry on 28.12.2016.
 */

@Service
@Profile("map")
public class ProductServiceImpl extends AbstractMapService implements ProductService {

    private ProductFormToProduct productFormToProduct;

    @Autowired
    public void setProductFormToProduct(ProductFormToProduct productFormToProduct) {
        this.productFormToProduct = productFormToProduct;
    }


    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product getById(Integer id) {
        return (Product) super.getById(id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
        return saveOrUpdate(productFormToProduct.convert(productForm));
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }


}
