package com.company;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double calculateVolume(){
        return height*width*length;
    }


    public void printVolume(){
        System.out.println("Box{" + "length =" + length + "height = " + height + " width = " + width + '}');
    }
}
