package com.bridgelabz.generix;

public class FindMaximum <T extends Comparable<T>> {

    public <T extends Comparable <T>> T maximum(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        return max;
    }
}


