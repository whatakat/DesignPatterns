package com.example.designpatterns.compositePatterns;

import com.example.designpatterns.compositePatterns.observer.Observable;
import com.example.designpatterns.compositePatterns.observer.Observer;

public class RubberDuck implements Quackable {
    Observable observable;
    public RubberDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
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
