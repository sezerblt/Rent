package com.company.pojo;

public class Customer {
    public String customerName;
    public String customerAdres;

    private int DateOut;
    private int DateIn;
    private double amount;
    private double charge;
    private double TotalAmount;
    private int CustomerCount;
    private static final double BASE_CHARGE = 10;
    private int DOB;
    private int TelephoneNumber;

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
