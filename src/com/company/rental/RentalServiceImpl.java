package com.company.rental;

import com.company.pojo.Car;
import com.company.pojo.Customer;
import com.company.service.CustomerRepository;
import com.company.service.RentalRepository;
import com.company.service.RentalService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


import javax.annotation.PreDestroy;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class RentalServiceImpl implements RentalService, BeanPostProcessor {

    private CustomerRepository customerRepository;
    private RentalRepository rentalRepository;
    private Properties carProperties;
    //private List<Car> carList;

    public RentalServiceImpl() {
    }

    public RentalServiceImpl(CustomerRepository customerRepository,RentalRepository rentalRepository) {
        super();
        this.customerRepository = customerRepository;
        this.rentalRepository = rentalRepository;
    }

    //@ConstructorProperties({"customerRepositoryImpl","rentalRepositoryImpl"})
    /*
    public void initRentalService(){
        System.out.println("...Start RentalService...");
        System.out.println("-------------------------");
    }
    public void destroyRentalService(){
        System.out.println("-------------------------");
        System.out.println("!!!End RentalService!!!");
    }*/

    @Override
    public Rental rentACar(String customerName, List<Car> carList, Date begin, Date end) {
        return null;
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
    /*
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
    }*/

    public Properties getCarProperties() {
        return carProperties;
    }

    public void setCarProperties(Properties carProperties) {
        this.carProperties = carProperties;
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

    /*
    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }*/

    @Override
    public String toString() {
        return "RentalServiceImpl\n{" +
                "   customerRepository=" + customerRepository +
                ",  rentalRepository=" + rentalRepository +
                '\n'+'}';
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof RentalService){
            ClassLoader loader = bean.getClass().getClassLoader();
            Class[] interfaces = new Class[]{RentalService.class};
            LogHandler logHandler = new LogHandler((RentalService) bean);
            //vekil nesne olustur
            RentalService service = (RentalService) Proxy.newProxyInstance(loader,interfaces,logHandler);
            return service;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @PreDestroy
    private void releaseResources() {
        System.out.println("pre-destroy: releaseResources called");
        /*for xml
        * <beans default-destroy-method="releaseResources">
        * */
    }
}
