package com.example.designpatterns.compositePatterns.abstractFactory;

import com.example.designpatterns.compositePatterns.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuckC();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
