package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer integer[] = {1,2,3,4};
        System.out.println(Arrays.toString(integer));
        Integer arr[] = {1,-1,7,0,89};
        //Arrays.sort(arr);

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
