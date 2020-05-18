package com.company.pojo;

public class Car {

    private int carNo;
    private String brand; //marka
    private String model; //model
    private String licensePlate;//plaka
    private int yearModel; //cikis yili
    private int numberModel; //modelNo

    public Car(String model) {
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

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getNumberModel() {
        return numberModel;
    }

    public void setNumberModel(int numberModel) {
        this.numberModel = numberModel;
    }
}
