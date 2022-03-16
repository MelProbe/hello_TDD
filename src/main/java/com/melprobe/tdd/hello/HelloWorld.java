package com.melprobe.tdd.hello;

public class HelloWorld {

    public String getMessage() {
        return getMessage("World");
    }

    public String getMessage(String name) {
        if (name == null) {
            name = "World";
        }
        
        return "Hello " + name;
    }

}
