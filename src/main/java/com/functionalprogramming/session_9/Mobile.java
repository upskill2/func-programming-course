package com.functionalprogramming.session_9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Mobile {

    private final int ram;
    private final int storage;
    private final int battery;
    private final String processor;
    private final double screenSize;
    private final int camera;
    private final String os;

    public Mobile (MobileBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.battery = builder.battery;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.camera = builder.camera;
        this.os = builder.os;
    }
}
