package com.example.designpatterns.command;

public class TVOnCommand implements Command {
    Tv tv;
    public TVOnCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();

    }
}
