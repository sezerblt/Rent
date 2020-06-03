package com.company.service;

import com.company.pojo.Car;
import com.company.rental.Rental;

import java.util.Date;
import java.util.List;

public interface RentalService {
    public Rental rentACarToList(String customerName, List<Car> carList, Date begin, Date end);
    public Rental rentACar(String customerName, Car car, Date begin, Date end);
}
