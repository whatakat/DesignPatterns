package com.example.designpatterns.factory;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){

    }

    @Override
    void prepare() {

    }

    @Override
    void bake() {
        super.bake();
    }

    @Override
    void cut() {
        super.cut();
    }

    @Override
    void box() {
        super.box();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
