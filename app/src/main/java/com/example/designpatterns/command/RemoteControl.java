package com.example.designpatterns.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offComands;

    public RemoteControl(){
        onCommands = new Command[7];
        offComands = new Command[7];

    }
}
