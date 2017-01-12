package com.dmitrykhramov.spring.services;

import com.dmitrykhramov.spring.commands.CustomerForm;
import com.dmitrykhramov.spring.domain.Customer;

/**
 * Created by Dmitry on 29.12.2016.
 */

public interface CustomerService extends CrudService<Customer> {

    Customer saveOrUpdateCustomerForm(CustomerForm customerForm);
}
