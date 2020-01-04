package com.example.designpatterns.compositePatterns.abstractFactory;

import com.example.designpatterns.compositePatterns.DuckCall;
import com.example.designpatterns.compositePatterns.MallardDuckC;
import com.example.designpatterns.compositePatterns.QuackCounter;
import com.example.designpatterns.compositePatterns.Quackable;
import com.example.designpatterns.compositePatterns.RedheadDuck;
import com.example.designpatterns.compositePatterns.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuckC() {
        return new QuackCounter(new MallardDuckC());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
