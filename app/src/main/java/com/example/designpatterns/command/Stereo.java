package com.example.designpatterns.command;

public class Stereo {
    public void on(){
        System.out.println("Stereo on");
    }
    public void off(){
        System.out.println("Stereo off");
    }
    public void setCd(){
        System.out.println("set CD");
    }
    public void setDvd(){}
    public void setRadio(){}
    public void setVolume(int volume){}
    public Stereo(String comment){}
}
