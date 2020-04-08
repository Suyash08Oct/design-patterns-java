package com.pattern.command;

public class RemoteControl {
    private Command lightCommand;

    public void setLightCommand(Command lightOnCommand) {
        this.lightCommand = lightOnCommand;
    }

    public void lightButton() {
        lightCommand.execute();
    }
}
