package com.functionalprogramming.session_9;

public class CommandDesignDemo {

    public static void main (String[] args) {

        AC ac1 = new AC ();
        AC ac2 = new AC ();

        ACAutomationRemote remote = new ACAutomationRemote ();
        remote.setCommand (() -> ac1.turnOn ());
        remote.buttonPressed ();

    }
}
