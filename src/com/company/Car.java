package com.company;

public class Car {
    private String make;
    private String model;
    private int year;
    private boolean isRunning;


    public Car(String make, String model, int year, boolean isRunning) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = isRunning;
    }

    public void startTheCar(){
        if(!isRunning) {
            isRunning =true;
        }
    }


    public void printDetails() {
        System.out.println("Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", isRunning=" + isRunning +
                '}');
    }
}
