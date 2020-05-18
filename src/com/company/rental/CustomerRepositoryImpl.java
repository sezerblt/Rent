package com.company.rental;

import com.company.pojo.Customer;
import com.company.service.CustomerRepository;
import org.springframework.orm.jpa.vendor.Database;

//XXXrepository sınıfın verilerinden sorumlu olan sınıftır.
public class CustomerRepositoryImpl implements CustomerRepository {
    private Database database;
    private int port;

    public void save(Customer customer) {
    }

    public Customer getCustomerByName(String customerName) {

        return new Customer(customerName);
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
