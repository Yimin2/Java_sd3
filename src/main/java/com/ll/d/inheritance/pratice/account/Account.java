package com.ll.d.inheritance.pratice.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    private String accountNumber;
    private double balance;

    public double deposit(double amount) {
        return balance += amount;
    };

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("출금 불가");
        }
    };
}
