package com.example.designpatterns.compositePatterns;

public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
