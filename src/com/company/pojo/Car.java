package com.company.pojo;

public class Car {

    private int carNo;
    private String brand;
    private String model;

    public Car(String mode) {
        this.model = model;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
