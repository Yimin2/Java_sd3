package com.ll.h.exception;

import lombok.AllArgsConstructor;

class InsufficientBalanceException extends Exception {
    private int current;
    private int request;

    public InsufficientBalanceException(int current, int request) {
        super(current + "/" + request);
        this.current = current;
        this.request = request;
    }

}

@AllArgsConstructor
public class BankAccount {
    private int balance;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(10000);
        try {
            ba.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        System.out.println(ba.balance);
    }
}
