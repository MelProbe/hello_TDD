package com.melprobe.tdd.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void test() {
        assertEquals("1,000", StringUtils.commma(1000));
        assertEquals("10,000", StringUtils.commma(10000));
        assertEquals("100,000", StringUtils.commma(100000));
        assertEquals("1,200,000", StringUtils.commma(1200000));
    }

    @Test(expected=IllegalStateException.class)
    public void testException() {
        new StringUtils();
        fail("Expected exception");
    }
}
