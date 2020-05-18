package com.company.rental;

import com.company.pojo.Customer;
import com.company.service.CustomerRepository;
import org.springframework.orm.jpa.vendor.Database;

//XXXrepository sınıfın verilerinden sorumlu olan sınıftır.
public class CustomerRepositoryImpl implements CustomerRepository {
    private DummyDataSourceImpl datasource;
    private int port;

    public void save(Customer customer) {
    }

    public Customer getCustomerByName(String customerName) {

        return new Customer(customerName);
    }

    public DummyDataSourceImpl getDatasource() {
        return datasource;
    }

    public void setDatasource(DummyDataSourceImpl datasource) {
        this.datasource = datasource;
    }
}
