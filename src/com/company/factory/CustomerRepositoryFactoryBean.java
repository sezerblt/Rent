package com.company.factory;

import com.company.service.CustomerRepository;
import com.company.rental.CustomerRepositoryImpl;
import org.springframework.beans.factory.FactoryBean;

public class CustomerRepositoryFactoryBean implements FactoryBean<CustomerRepository> {

    public CustomerRepository getNewInstance() {
        return new CustomerRepositoryImpl();
    }

    @Override
    public CustomerRepository getObject() throws Exception {
        return new CustomerRepositoryImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return CustomerRepository.class;
    }

    /*
    * isSingleton() metodu true değerini geri verirse, Spring tarafından
tekil bir nesne oluştur. Bu değer false ise, Spring her istekte yeni bir nesne
oluştur.*/
    @Override
    public boolean isSingleton() {
        return true;
    }
}
