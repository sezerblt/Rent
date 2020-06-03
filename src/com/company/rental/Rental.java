package com.company.rental;

import com.company.pojo.Car;
import com.company.pojo.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Rental {
    public List<Car> carList;
    public Customer customer;
    public Car car;
    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
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
                "  car=" + carList.getClass().getSimpleName() +
                ",  customer=" + customer.getClass()+"-"+customer.getCustomerName() +
                '\n'+' '+'}';
    }
}
