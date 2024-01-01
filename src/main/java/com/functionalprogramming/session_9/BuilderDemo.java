package com.functionalprogramming.session_9;

public class BuilderDemo {

    public static void main (String[] args) {

        Mobile mobile = new MobileBuilder ()
                .with (builder -> {
                    builder.ram = 4;
                    builder.storage = 64;
                    builder.battery = 4000;
                    builder.processor = "Snapdragon 855";
                    builder.screenSize = 6.4;
                    builder.camera = 48;
                    builder.os = "Android";
                })
                .build ();

        System.out.println (mobile);

    }
}
