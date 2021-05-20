package com.sds.vuestarter.util.number;

public class NumberUtil {
    public static int rand(int min, int max) {
        return (int)(Math.random()*(max-min+1)) + min;
    }
    
    public static int rand(int max) {
        return NumberUtil.rand(0,max);
    }
}
