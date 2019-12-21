package com.example.designpatterns.adapter;

public class TurkeyAdapter implements DuckA {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i <5 ; i++) {
            turkey.fly();

        }

    }
}
