package com.pattern.command;

public class CommandPattern {
    public static void main(String... s) {
        RemoteControl remote = new RemoteControl();
        LightCommand command = new LightCommand(new Light());

        remote.setLightCommand(command);

        // Pressing Remote Button 5 Times
        for (int i = 0; i < 5; i++) {
            remote.lightButton();
        }

    }
}
