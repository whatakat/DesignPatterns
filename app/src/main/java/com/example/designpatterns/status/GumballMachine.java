package com.example.designpatterns.status;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs>0){
            state = noQuarterState;
        }else {
            state = soldOutState;
        }
    }
    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    void setState(State state){
        this.state = state;
    }
    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count!= 0){
            count = count - 1;
        }
    }

    public String toString(){
        return "GumballMachine with "+count+" Status- "+state;
    }
    public State getNoQuarterState(){
        return noQuarterState;
    }
    public State getSoldState(){
        return soldState;
    }
}
