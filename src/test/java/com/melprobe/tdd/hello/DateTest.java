package com.melprobe.tdd.hello;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateTest {

    @Test
    public void testDate() {
        Date date = new Date();
        Class<? extends Date> class1 = date.getClass();
        String name = class1.getName();
        assertEquals("java.util.Date", name);
    }
    
    @Test
    public void testTimestamp() {
        assertTrue(new Date().getTime() > 1647493037645L);
    }
}
