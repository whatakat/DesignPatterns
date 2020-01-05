package com.example.designpatterns.compositePatterns;

import com.example.designpatterns.compositePatterns.abstractFactory.AbstractDuckFactory;
import com.example.designpatterns.compositePatterns.abstractFactory.CountingDuckFactory;
import com.example.designpatterns.compositePatterns.linker.Flock;
import com.example.designpatterns.compositePatterns.observer.Quacklogist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuckC();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Composite - Flocks");
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuckC();
        Quackable mallardTwo = duckFactory.createMallardDuckC();
        Quackable mallardThree = duckFactory.createMallardDuckC();
        Quackable mallardFour = duckFactory.createMallardDuckC();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");
        Quacklogist quacklogist = new Quacklogist();
        flockOfDucks.registerObserver(quacklogist);
        simulate(flockOfDucks);
        System.out.println("\nThe ducks quacked "+
                QuackCounter.getQuacks()+
                " times");
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
