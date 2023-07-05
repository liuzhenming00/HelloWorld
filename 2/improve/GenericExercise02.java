package com.improve;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new date(2000,11,11)));
        employees.add(new Employee("jack",12000,new date(2001,12,12)));
        employees.add(new Employee("tom",50000,new date(2000,10,10)));
    System.out.println(employees);
    System.out.println("===========排序==========");
    employees.sort(new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int i = o1.getName().compareTo(o2.getName());
            if (i != 0) {
                return i;

            }
          return o1.getBirthday().compareTo(o2.getBirthday());



        }
    });
        System.out.println(employees);
    }
}

