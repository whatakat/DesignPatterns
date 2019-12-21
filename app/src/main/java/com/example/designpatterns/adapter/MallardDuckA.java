package com.example.designpatterns.adapter;

public class MallardDuckA implements DuckA {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
