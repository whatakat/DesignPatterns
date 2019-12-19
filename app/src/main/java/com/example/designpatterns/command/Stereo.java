package com.example.designpatterns.command;

public class Stereo {
    String comment;
    public void on(){
        System.out.println("Stereo on "+comment);
    }
    public void off(){
        System.out.println("Stereo off "+comment);
    }
    public void setCd(){
        System.out.println("set CD "+comment);
    }
    public void setDvd(){
        System.out.println("set DVD "+comment);
    }
    public void setRadio(){
        System.out.println("set radio "+comment);
    }
    public void setVolume(int volume){}
    public Stereo(String comment){
        this.comment = comment;
    }
}
