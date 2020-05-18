package com.company.pojo;

public class Customer {
    public String customerName;
    public String customerAdres;

    public Customer() {
    }
    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdres() {
        return customerAdres;
    }

    public void setCustomerAdres(String customerAdres) {
        this.customerAdres = customerAdres;
    }

}
