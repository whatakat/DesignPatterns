package com.example.designpatterns.compositePatterns.abstractFactory;

import com.example.designpatterns.compositePatterns.DuckCall;
import com.example.designpatterns.compositePatterns.MallardDuckC;
import com.example.designpatterns.compositePatterns.Quackable;
import com.example.designpatterns.compositePatterns.RedheadDuck;
import com.example.designpatterns.compositePatterns.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuckC() {
        return new MallardDuckC();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
