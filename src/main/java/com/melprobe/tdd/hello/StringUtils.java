package com.melprobe.tdd.hello;

import java.text.NumberFormat;

public class StringUtils {
    
    public static String commma(int num) {
        return NumberFormat.getNumberInstance().format(num);
    }
}
