package com.bridgelabz.generix;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximum <T extends Comparable<T>> {
    ArrayList<T> a;

    public FindMaximum(ArrayList<T> a) {
        this.a = a;
    }

    public T maximum(){
        return FindMaximum.maximum(a);
    }

    public static <T extends Comparable <T>> T maximum(ArrayList<T> a) {
        Collections.sort(a);
        return (T) Collections.max(a);
    }
}