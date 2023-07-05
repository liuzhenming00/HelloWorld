package com.hspedu.homework;

public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        checkingAccount.withdraw(9);
        System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(2000);
        savingsAccount.deposit(1000);
        savingsAccount.deposit(1000);
        savingsAccount.deposit(1000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(1000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());

    }
}
