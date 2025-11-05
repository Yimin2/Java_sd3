package com.ll.b.oop.Practice;

public class BankAccount {
    String accountNumber;
    int balance;

    public BankAccount (String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (int amount) {
        balance += amount;
        System.out.printf("입금 %d, 잔액: %d\n", amount, balance);
    }

    public void withdraw (int amount) {
        balance -= amount;
        System.out.printf("출금 %d, 잔액: %d\n", amount, balance);
    }

    public void getBalance () {
        System.out.printf("잔액: %d\n", balance);
    }
}
