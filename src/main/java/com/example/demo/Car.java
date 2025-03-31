package com.example.demo;

public class Car {

    private String carName;
    private int carNumber;
    private String owner;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public String toString() {
        return "#"+carName+"\n"+carNumber+"\n"+owner;
    }

}
