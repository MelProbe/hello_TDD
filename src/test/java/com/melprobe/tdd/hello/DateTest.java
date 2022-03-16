package com.melprobe.tdd.hello;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateTest {

    @Test
    public void test() {
        Date date = new Date();
        Class<? extends Date> class1 = date.getClass();
        String name = class1.getName();
        assertEquals("", name);
    }

}
