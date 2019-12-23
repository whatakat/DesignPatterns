package com.example.designpatterns.templateMethod;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
