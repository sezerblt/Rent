package com.company.rental;

import com.company.dao.MysqlDatasourceImpl;
import com.company.pojo.Customer;
import com.company.service.CustomerRepository;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.stereotype.Component;

//XXXrepository sınıfın verilerinden sorumlu olan sınıftır.
@Component("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
    //private MysqlDatasourceImpl datasource;
    //private int port;

    public void save(Customer customer) {
    }

    public Customer getCustomerByName(String customerName) {

        return new Customer(customerName);
    }

    /*
    public MysqlDatasourceImpl getDatasource() {
        return datasource;
    }

    public void setDatasource(MysqlDatasourceImpl datasource) {
        this.datasource = datasource;
    }*/
}
