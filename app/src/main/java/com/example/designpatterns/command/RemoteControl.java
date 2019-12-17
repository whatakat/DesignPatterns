package com.example.designpatterns.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offComands;

    public RemoteControl(){
        onCommands = new Command[7];
        offComands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i <7 ; i++) {
            onCommands[i] = noCommand;
            offComands[i] = noCommand;
        }
    }
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offComands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offComands[slot].execute();
    }
}
