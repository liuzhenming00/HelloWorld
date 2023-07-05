package com.hspedu.poly.polyparameter;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",3000);
        Manager milan = new Manager("milan", 4000, 200);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.shouEmpAnnual(tom);
        ployParameter.shouEmpAnnual(milan);
        ployParameter.testWork(tom);
    }
    public void shouEmpAnnual(Employyee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employyee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        }
        else if (e instanceof Manager){
            ((Manager) e).manager();
        }else{
            System.out.println("你输入有误");
        }
    }
}
