package com.hspedu.homework;

public class HomeWork13 {
    public static void main(String[] args) {
        Student student = new Student("小明", '男', 24, "28845");
        student.printInfo();
        Teacherss teacherss = new Teacherss("王老师", '男', 40, 20);
        System.out.println("---------------------------");
        teacherss.printInfo();
        PPerson[] pp = new PPerson[4];
        pp[0] = new Student("ww",'男',12,"1234");
        pp[1] = new Student("yy",'男',14,"1454");
        pp[2] = new Teacherss("uu",'男',54,34);
        pp[3] = new Teacherss("tt",'男',45,44);
        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.bubbleSort(pp);
        System.out.println("排序后的数组");
        for (int i = 0; i < pp.length ; i++) {
            System.out.println(pp[i]);


        }
        System.out.println("=========================");
        for (int i = 0; i < pp.length ; i++) {
           homeWork13.test(pp[i]);


        }
    }
    public void bubbleSort(PPerson[] p){
        PPerson tem = null;
        for (int i = 0; i < p.length -1 ; i++) {
            for (int j = 0; j < p.length-i-1; j++) {
                if (p[j].getAge() < p[j+1].getAge()){
                    tem = p[j];
                    p[j] = p[j+1];
                    p[j+1] = tem;

                }

            }

        }
    }
    public void test(PPerson person){
        if (person instanceof Student){
            ((Student) person).strdy();

        }
        else if (person instanceof Teacherss){
            ((Teacherss) person).teach();
        }
        else{
            System.out.println("nothing....");
        }
    }
}
