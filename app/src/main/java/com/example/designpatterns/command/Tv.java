package com.example.designpatterns.command;

public class Tv {
    String comment;
    public void on(){
        System.out.println("Tv is on");
    }
    public void off(){
        System.out.println("Tv is off");
    }
    public Tv(String comment){
        this.comment = comment;
    }
}
