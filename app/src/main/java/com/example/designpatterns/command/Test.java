package com.example.designpatterns.command;

public class Test {
    public static void main(String[] args) {
        Light light = new Light("Living room");
        Tv tv = new Tv("Living room");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

    }
}
