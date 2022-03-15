package com.melprobe.tdd.hello;

import java.text.NumberFormat;

public class StringUtils {
    
    public static String commma(int num) {
        String sNum = NumberFormat.getNumberInstance().format(num);
        
        return sNum;
    }
}
