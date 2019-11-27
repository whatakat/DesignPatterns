package com.example.designpatterns.strategy;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quakBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
