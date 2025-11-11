package com.ll.d.inheritance.pratice4;

import lombok.AllArgsConstructor;

interface Payment {
    void processPayment(int amount);
    String getPaymentMethod();
    default void printReceipt(int amount) {
        System.out.println("영수증 " + amount + "-" + getPaymentMethod());
    }
}

@AllArgsConstructor
class CreditCardPayment implements Payment{
    private String cardNumber;

    @Override
    public void processPayment(int amount) {
        System.out.println(cardNumber + amount);
    }

    @Override
    public String getPaymentMethod() {
        return "신용카드";
    }
}

class CashPayment implements Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println(amount);
    }

    @Override
    public String getPaymentMethod() {
        return "현금";
    }
}


public class Practice5 {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCardPayment("1234-5678"), new CashPayment()};

        int amount = 50000;
        for (Payment payment : payments) {
            payment.processPayment(amount);
            payment.printReceipt(amount);
            System.out.println();
        }
    }
}
