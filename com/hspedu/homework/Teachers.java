package com.hspedu.homework;

public class Teachers extends Work{
    private int workDays;
    private double workSal;

    public Teachers(String name, int age, double sal) {
        super(name, age, sal);
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getWorkSal() {
        return workSal;
    }

    public void setWorkSal(double workSal) {
        this.workSal = workSal;
    }

    @Override
    public void getInfo() {
        System.out.println(getName() + " 的工资为"
                + (getSal() +getWorkDays() * getWorkSal()));

    }
}

