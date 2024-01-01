package com.functionalprogramming.session_9;

import java.util.function.Consumer;

public class MobileBuilder {

     int ram;
     int storage;
     int battery;
     String processor;
     double screenSize;
     int camera;
     String os;

    public MobileBuilder with (Consumer<MobileBuilder> builderFields) {
        builderFields.accept (this);
        return this;
    }

    public Mobile build () {
        return new Mobile (this);
    }

}
