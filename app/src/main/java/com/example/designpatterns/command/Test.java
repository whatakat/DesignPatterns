package com.example.designpatterns.command;

public class Test {
    public static void main(String[] args) {
        Light light = new Light("Living room");
        Tv tv = new Tv("Living room");
        Stereo stereo = new Stereo("Living room");

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);

        Command[] partyOn={lightOn,stereoOn,tvOn};
        Command[] partyOff={lightOff,stereoOff,tvOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);


    }
}
