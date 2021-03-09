package com.bridgelabz.generix;

public class FindMaximum <T extends Comparable<T>> {

    T value1, value2, value3;

    public FindMaximum(T value1, T value2, T value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T maximum(){
        return FindMaximum.maximum(value1, value2, value3);
    }

    public static <T extends Comparable <T>> T maximum(T value1, T value2, T value3) {
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


