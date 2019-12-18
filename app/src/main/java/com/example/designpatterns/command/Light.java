package com.example.designpatterns.command;

public class Light {
    String comment;
    public void on(){
        System.out.println("Light is on "+comment);
    }
    public void off(){
        System.out.println("Light is off "+comment);
    }
    public Light(String comment){
        this.comment = comment;
    }
}
