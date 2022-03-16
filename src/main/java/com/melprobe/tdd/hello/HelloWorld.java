package com.melprobe.tdd.hello;

public class HelloWorld {

    private static final String HELLO_WORLD = "Hello World";

    public String getMessage() {
        return HELLO_WORLD;
    }

    public String getMessage(String name) {
        if (name == null) {
            name = "World";
        }
        
        return "Hello " + name;
    }

}
