package com.example.designpatterns.strategy;

public class MuteQuack implements QuakBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
