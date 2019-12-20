package com.example.designpatterns.command;

public class TVOffCommand implements Command {
    Tv tv;
    public TVOffCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();

    }
}
