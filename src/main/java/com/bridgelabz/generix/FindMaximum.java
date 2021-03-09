package com.bridgelabz.generix;

public class FindMaximum {

    public Integer findMaxInteger(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public Float findMaxFloat(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public String findMaxString(String name1, String name2, String name3) {
        String max = name1;
        if (name2.compareTo(max) > 0) {
            max = name2;
        }
        if (name3.compareTo(max) > 0) {
            max = name3;
        }
        return max;
    }
}


