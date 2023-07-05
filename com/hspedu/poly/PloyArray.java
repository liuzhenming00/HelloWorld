package com.hspedu.poly;

public class PloyArray {
    public static void main(String[] args) {
        Person[] person =new  Person[5];
        person[0] = new Person("jack",23);
        person[1] = new Student("mary",18,100);
        person[2] = new Student("smith",19,30);
        person[3] = new Teacher("scott",30,20000);
        person[4] = new Teacher("king",50,23000);
        for (int i = 0; i < person.length; i++) {
           System.out.println(person[i].say());
            if (person[i] instanceof Student){
               ((Student) person[i]).study();
            }else if (person[i] instanceof Teacher){
                ((Teacher) person[i]).teach();
            }else{
                System.out.println("你的类型有误，请自己检查。。。");
            }
        }

    }
}
