package com.example.designpatterns.command;

public abstract interface Command {
    public void execute();
    public void undo();
}
