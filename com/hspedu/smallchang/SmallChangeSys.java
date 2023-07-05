package com.hspedu.smallchang;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SmallChangeSys {
    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "------零钱通明细-------";
        double money = 0;
        double balance = 0;
        String note = "";
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm");
        String choice ="";

        do{
            System.out.println("------零钱通菜单------");
            System.out.println("1.零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退\t出");
            System.out.println("请选择(1-4)");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2.收益入账");
                    System.out.println("请输入入账金额：");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("到账不能低于零");
                        break;
                    }

                        balance += money;
                        date = new Date();

                        details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;


                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();

                    System.out.println("消费说明：");
                    note = scanner.next();
                    if(money > balance || money <= 0){
                        System.out.println("消费金额不能为0或者大于余额");
                        break;
                    }

                    balance -=  money;
                    date = new Date();

                    details += "\n" + note +"\t-" + money +"\t" + simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case "4":
                    System.out.println("4.退\t出");
                    while (true){
                        System.out.println("你确实要退出吗 y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)){
                           break;
                        }

                    }
                    if(choice.equals("y")){
                        loop = false;
                    }
                    break;


                default:
                    System.out.println("输入有误，请重新选择");

            }
        }while(loop);
        System.out.println("-------退出了零钱通项目-----------");
    }
}
