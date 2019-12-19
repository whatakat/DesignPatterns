package com.example.designpatterns.command;

public class Stereo {
    String comment;
    public void on(){
        System.out.println("Stereo on");
    }
    public void off(){
        System.out.println("Stereo off");
    }
    public void setCd(){
        System.out.println("set CD");
    }
    public void setDvd(){
        System.out.println("set DVD");
    }
    public void setRadio(){
        System.out.println("set radio");
    }
    public void setVolume(int volume){}
    public Stereo(String comment){
        this.comment = comment;
    }
}
