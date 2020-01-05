package com.example.designpatterns.compositePatterns.linker;

import com.example.designpatterns.compositePatterns.Quackable;
import com.example.designpatterns.compositePatterns.observer.Observable;
import com.example.designpatterns.compositePatterns.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    Observable observable;
    ArrayList<Quackable> quckers = new ArrayList<Quackable>();
    public void add(Quackable quacker){
        quckers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quckers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();

    }
}
