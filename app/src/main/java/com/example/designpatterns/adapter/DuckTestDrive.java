package com.example.designpatterns.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuckA duck = new MallardDuckA();
        WildTurkey turkey = new WildTurkey();
        DuckA turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(DuckA duck){
        duck.quack();
        duck.fly();
    }
}
