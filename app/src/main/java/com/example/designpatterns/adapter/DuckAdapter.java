package com.example.designpatterns.adapter;

public class DuckAdapter implements Turkey {
    DuckA duckA;

    public DuckAdapter(DuckA duckA){
        this.duckA = duckA;
    }

    @Override
    public void gobble() {
        duckA.quack();
    }

    @Override
    public void fly() {
        duckA.fly();

    }
}
