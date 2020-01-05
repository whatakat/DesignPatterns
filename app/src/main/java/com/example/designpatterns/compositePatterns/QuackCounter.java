package com.example.designpatterns.compositePatterns;

import com.example.designpatterns.compositePatterns.observer.Observable;
import com.example.designpatterns.compositePatterns.observer.Observer;

public class QuackCounter implements Quackable {
    Quackable duck;
    Observable observable;
    static int numberOfQuacks;
    public QuackCounter(Quackable duck){
        this.duck = duck;
    }
    public void quack(){
        duck.quack();
        numberOfQuacks++;
    }
    public static int getQuacks(){
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();

    }
}
