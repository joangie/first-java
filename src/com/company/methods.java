package com.company;

public class methods {
    public static void main(String[] args){
        String greeting = generateGreeting("ES", "Joe");
        System.out.println(greeting);
        double interest = calculateInterest(500, 3, 2);
        System.out.println(interest);
        double salary = calculateSalary(40,50);
        System.out.println(salary);
    }

    public static double calculateInterest(double principal, int time, double roi){
        return principal*time*roi/100;
    }

    public static String generateGreeting(String lang, String name){
        if(lang == "EN"){
            return "Hello " + name;
        }
        if(lang == "ES"){
            return "Hola " + name;
        }
        if(lang == "FR"){
            return "Bonjour " + name;
        }
        else{
            return "Hi" + name;
        }
    }

    //WAP to calculate salary, parameters are hours, hourly rate
    public static double calculateSalary( int hours, double payRate){
        return hours*payRate;
    }
}
