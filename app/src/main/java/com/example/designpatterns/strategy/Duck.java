package com.example.designpatterns.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuakBehavior quakBehavior;

    public Duck(){}
    public void perfomFly(){
        flyBehavior.fly();

    }
    public void performQuack(){
        quakBehavior.quack();

    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
