package com.company.rental;

import com.company.pojo.Car;
import com.company.pojo.Customer;

import java.util.List;

public class Rental {
    public List<Car> car;
    public Customer customer;

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isRented() {
        return true;
    }

    @Override
    public String toString() {
        return "Rental {\n" +
                "  car=" + car.getClass().getSimpleName() +
                ",  customer=" + customer.getClass()+"-"+customer.getCustomerName() +
                '\n'+' '+'}';
    }
}
