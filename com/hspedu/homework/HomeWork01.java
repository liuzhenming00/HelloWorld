package com.hspedu.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack23",20,"医生");
        person[1] = new Person("jack4",26,"教师");
        person[2] = new Person("jack7785675",22,"工人");
        Person temp = null;
        for (int i = 0; i < person.length  ; i++) {
            System.out.println(person[i]);
        }
        for (int i = 0; i < person.length - 1 ; i++) {

                 for (int j = 0; j < person.length - i; j++) {

                     if(person[i].getName().length() > person[i + 1].getName().length()) {

                     temp = person[i];
                     person[i] = person[i + 1];
                     person[i + 1] = temp;
                 }
             }

        }
        System.out.println("排序后的结果");
        for (int i = 0; i < person.length  ; i++) {
            System.out.println(person[i]);
        }
        }
    }

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
  }
}
