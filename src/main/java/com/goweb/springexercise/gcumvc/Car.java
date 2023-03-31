package com.goweb.springexercise.gcumvc;

public class Car {
    String brand;
    String price;
    String details;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Car(String brand, String price, String details) {
        this.brand = brand;
        this.price = price;
        this.details = details;
    }
}
