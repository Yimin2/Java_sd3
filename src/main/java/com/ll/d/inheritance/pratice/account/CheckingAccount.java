package com.ll.d.inheritance.pratice.account;

public class CheckingAccount extends Account {
    private int overdraftLimit;

    public CheckingAccount(String accountNumber, int balance, int overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("출금 불가");
        }
    }
}
