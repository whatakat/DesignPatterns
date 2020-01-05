package com.example.designpatterns.compositePatterns;

import com.example.designpatterns.compositePatterns.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
