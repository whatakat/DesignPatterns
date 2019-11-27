package com.example.designpatterns.strategy;

public class Quack implements QuakBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
