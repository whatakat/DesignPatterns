package com.example.designpatterns.decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
        +" $"+beverage.cost());
    }
}
