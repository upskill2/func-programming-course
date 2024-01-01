package com.functionalprogramming.session_9;

public class ACAutomationRemote {

    private Command command;

    public void setCommand (Command command) {
        this.command = command;
    }

    public void buttonPressed () {
        command.execute ();
    }
}
