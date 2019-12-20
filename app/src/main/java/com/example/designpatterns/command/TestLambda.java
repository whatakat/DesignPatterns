package com.example.designpatterns.command;

public class TestLambda {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Main house");
        final Stereo stereo = new Stereo("Living room");

//        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
//        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
//        remoteControl.setCommand(2,ceilingFan::high, ceilingFan::off);
//
//        Command stereoOnWithCD =() ->{
//            stereo.on(); stereo.setCd(); stereo.setVolume(11);
//        };


    }
}
