package com.improve;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //printCollection2(list1);
      //  printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list1);
        //printCollection3(list2);
        printCollection3(list3);
       // printCollection3(list4);
       // printCollection3(list5);
    }
    public static void printCollection1(List<? > c){
        for (Object object : c ) {
            System.out.println(object);

        }

    }
    public static void printCollection2(List<? extends AAA> c){
        for (Object object : c ) {
            System.out.println(object);

        }

    }
    public static void printCollection3(List<? super AAA> c){
        for (Object object : c ) {
            System.out.println(object);

        }

    }
}
class AAA {

}
class BB extends AAA{

}
class CC extends BB{

}
