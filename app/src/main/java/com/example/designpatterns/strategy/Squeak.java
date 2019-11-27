package com.example.designpatterns.strategy;

public class Squeak implements QuakBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
