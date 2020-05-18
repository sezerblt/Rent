package com.company.rental;

import com.company.pojo.Car;
import com.company.pojo.Customer;
import com.company.service.CustomerRepository;
import com.company.service.RentalRepository;
import com.company.service.RentalService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalServiceImpl implements RentalService {

    private CustomerRepository customerRepository;
    private RentalRepository rentalRepository;
    private List<Car> carList;

    public RentalServiceImpl() {
    }

    public RentalServiceImpl(CustomerRepository customerRepository,RentalRepository rentalRepository) {
        super();
        this.customerRepository = customerRepository;
        this.rentalRepository = rentalRepository;
    }

    //@ConstructorProperties({"customerRepositoryImpl","rentalRepositoryImpl"})
    public void initRentalService(){
        System.out.println("...Start RentalService...");
        System.out.println("-------------------------");
    }
    public void destroyRentalService(){
        System.out.println("-------------------------");
        System.out.println("!!!End RentalService!!!");
    }

    @Override
    public Rental rentACar(String customerName, Car car, Date begin, Date end){
        Customer customer = customerRepository.getCustomerByName(customerName);
        if (customer == null) {
            customer = new Customer(customerName);
            customerRepository.save(customer);
        }

        Rental rental = new Rental();
        rental.setCar((List<Car>) car);
        rental.setCustomer(customer);
        rentalRepository.save(rental);
        return rental;
    }
    @Override
    public Rental rentACar(String customerName, List<Car> carList, Date begin, Date end){
        Car car1=new Car("fiesta2");
         carList = new ArrayList<Car>();
         carList.add(car1);
        Customer customer = customerRepository.getCustomerByName(customerName);
        if (customer == null) {
            customer = new Customer(customerName);
            customerRepository.save(customer);
        }

        Rental rental = new Rental();
        rental.setCar(carList);
        rental.setCustomer(customer);
        rentalRepository.save(rental);
        return rental;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public RentalRepository getRentalRepository() {
        return rentalRepository;
    }

    public void setRentalRepository(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "RentalServiceImpl\n{" +
                "   customerRepository=" + customerRepository +
                ",  rentalRepository=" + rentalRepository +
                '\n'+'}';
    }
}
