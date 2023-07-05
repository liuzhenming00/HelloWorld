package com.hspedu;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("liu");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());

    }
}
class Person{
    public String name;//名字公开
    private int age;//私有化
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else{
            System.out.println("名字的长度不对需要(2-6)个字符,默认名字");
            this.name = "无名小子";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("年龄需要在 1-120默认年龄为18" );
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public String info(){
        return "信息为name= " + name + " age= " + age + " salary= " + salary;
    }
}
