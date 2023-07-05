package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] a = {1,-1,8,0,20};
        bubble01(a);
        System.out.println("排序后的效果");
        System.out.println(Arrays.toString(a));
        bubble02(a, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 -i2;
            }
        });
        System.out.println("定制排序后的结果");
        System.out.println(Arrays.toString(a));

    }
    public static void bubble01(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j +1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void bubble02(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (c.compare(arr[j],arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j +1];
                    arr[j+1]=temp;
                }
            }

        }
    }
}
