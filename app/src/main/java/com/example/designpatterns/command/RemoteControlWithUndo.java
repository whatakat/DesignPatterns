package com.example.designpatterns.command;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offComands;
    Command undoCommand;

    public RemoteControlWithUndo(){
        onCommands = new Command[7];
        offComands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i <7 ; i++) {
            onCommands[i] = noCommand;
            offComands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offComands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot) {
        offComands[slot].execute();
        undoCommand = offComands[slot];
    }
    public void undoCommandWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------Remote Control -------\n");
        for (int i = 0; i <onCommands.length ; i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getName()+
                    "   "+offComands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
