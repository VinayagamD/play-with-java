package com.vinaylogics.playwithjava.designpatterns.behavioral.command;

public class SimpleRemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
