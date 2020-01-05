package com.example.designpatterns.compositePatterns;

import com.example.designpatterns.compositePatterns.observer.Observable;
import com.example.designpatterns.compositePatterns.observer.Observer;

public class DuckCall implements Quackable {
    Observable observable;
    public DuckCall(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Kwak");
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
