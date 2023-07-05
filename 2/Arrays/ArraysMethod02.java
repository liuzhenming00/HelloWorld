package com.Arrays;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[]  arr = { 1,2,90,123,567};
        int i = Arrays.binarySearch(arr, 568);
        System.out.println(i);
        Integer[] newArr = Arrays.copyOf(arr, arr.length+1);
        System.out.println("==处理完成后==");
        System.out.println(Arrays.toString(newArr));
        Integer[] num = new Integer[] {9,3,1};
        Arrays.fill(num,99);
        System.out.println("==num填充后==");
        System.out.println(Arrays.toString(num));
        Integer[] arr2 = {1,2,90,123,567};
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println("equals = " +equals);
        List asList = Arrays.asList("1223423423");
        System.out.println("asList="+asList);
        System.out.println("asList的运行类型"+asList.getClass());
    }
}
