package com.dmitrykhramov.spring.services.reposervices;

import com.dmitrykhramov.spring.commands.CustomerForm;
import com.dmitrykhramov.spring.converters.CustomerFormToCustomer;
import com.dmitrykhramov.spring.domain.Customer;
import com.dmitrykhramov.spring.repositories.CustomerRepository;
import com.dmitrykhramov.spring.repositories.UserRepository;
import com.dmitrykhramov.spring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitry on 09.01.2017.
 */

@Service
@Profile("springdatajpa")
public class CustomerServiceRepoImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private UserRepository userRepository;
    private CustomerFormToCustomer customerFormToCustomer;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setCustomerFormToCustomer(CustomerFormToCustomer customerFormToCustomer) {
        this.customerFormToCustomer = customerFormToCustomer;
    }

    @Override
    public List<?> listAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer getById(Integer id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return customerRepository.save(domainObject);
    }

    @Override
    public Customer saveOrUpdateCustomerForm(CustomerForm customerForm) {
        Customer newCustomer = customerFormToCustomer.convert(customerForm);

        if(newCustomer.getUser().getId() != null){
            Customer existingCustomer = getById(newCustomer.getId());

            newCustomer.getUser().setEnabled(existingCustomer.getUser().getEnabled());
        }

        return saveOrUpdate(newCustomer);
    }

    @Override
    @Transactional
    public void delete(Integer id) {

        Customer customer = customerRepository.findOne(id);

        userRepository.delete(customer.getUser());
        customerRepository.delete(customer);
    }
}
