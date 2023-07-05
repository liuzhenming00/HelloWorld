package com.hspedu;

public class Account {
    private String name;
    private double banlance;
    private String pwd;

    public Account() {

    }

    public Account(String name, double banlance, String pwd) {
        this.setName(name);
        this.setBanlance(banlance);
        this.setPwd(pwd);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("输入的字符长度不够默认为jak");
            this.name = "jak";
        }
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        if (banlance > 20) {
            this.banlance = banlance;
        } else {
            System.out.println("余额不足，默认为0");

        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须是6位默认为000000");
            this.pwd = "000000";
        }
    }

    public void shouInfo() {
        System.out.println(" 信息 name=" + name + " 余额 " + banlance + " 密码 " + pwd);
    }

}


