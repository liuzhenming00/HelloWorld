package com.hspedu.homework;

public class Manager extends Emloyee {
    private double bonus;

    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);

    }

    @Override
    public void printSal() {
        System.out.println("经理" + getName() + " 工资是"
                + (bonus + getDaySal() * getWorkDays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
