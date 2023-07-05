package com.hspedu.homework;

public class Scientist extends Work{
    private double bonus;

    public Scientist(String name, int age, double sal) {
        super(name, age, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void getInfo() {
        System.out.println(getName() + "的工资为" + (getSal() + bonus));
    }
}
