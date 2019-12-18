package com.example.designpatterns.command;

public class Light {
    public void on(){
        System.out.println("Light is on");
    }
    public void off(){
        System.out.println("Light is off");
    }
    public Light(String comment){}
}
