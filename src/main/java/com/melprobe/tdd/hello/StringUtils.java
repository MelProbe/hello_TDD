package com.melprobe.tdd.hello;

import java.text.NumberFormat;

public class StringUtils {

    StringUtils() {
        throw new IllegalStateException("Utility class");
    }
    
    public static String commma(int num) {
        return NumberFormat.getNumberInstance().format(num);
    }
}
