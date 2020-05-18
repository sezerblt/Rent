package com.company.service;

import com.company.pojo.Customer;

public interface CustomerRepository {

    public Customer getCustomerByName(String name);
    public void save(Customer customer);
}
