package com.cc.java;

public class Triangle extends Shape {

    private double beseline, height;

    public Triangle(double baseline, double height) { 
        this.height = height;
    }


    @Override
    public double area() {
        return beseline * height / 2;
    }


    
}
