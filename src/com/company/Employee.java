package com.company;

public class Employee {
    private String employeeName;
    private int employeeID;
    private double hourlyRate;
    private int numberOfHours;




    public Employee(String employeeName, int employeeID, double hourlyRate) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return 160*hourlyRate;
    }

    public void printDetails(){
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID : " + employeeID);
    }
}
