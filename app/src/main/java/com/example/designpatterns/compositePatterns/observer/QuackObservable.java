package com.example.designpatterns.compositePatterns.observer;


public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
