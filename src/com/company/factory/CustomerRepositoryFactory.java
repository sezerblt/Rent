package com.company.factory;

import com.company.service.CustomerRepository;
import com.company.rental.CustomerRepositoryImpl;

public class CustomerRepositoryFactory {

    public CustomerRepository getNewInstance() {
        return new CustomerRepositoryImpl();
    }
}
