package com.ll.d.inheritance.pratice;

import com.ll.d.inheritance.pratice.person.Student;
import com.ll.d.inheritance.pratice.account.CheckingAccount;
import com.ll.d.inheritance.pratice.account.SavingsAccount;
import com.ll.d.inheritance.pratice.vehicle.Car;
import com.ll.d.inheritance.pratice.vehicle.Truck;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("김철수", 20, 2024001, "컴퓨터공학");
        student.introduce();

        SavingsAccount savings = new SavingsAccount("SA001", 1000000, 0.03);
        savings.deposit(500000);
        savings.addInterest();
        System.out.println("저축예금 잔액: " + savings.getBalance());

        CheckingAccount checking = new CheckingAccount("CA001", 100000, 500000);
        checking.withdraw(400000);
        System.out.println("입출금예금 잔액: " + checking.getBalance());

        Car car = new Car("소나타", 50000, true);
        Truck truck = new Truck("포터", 70000, 1.5);

        System.out.println(car);
        System.out.println("3일 대여료: " + car.calculateRentalCost(3) + "원");

        System.out.println(truck);
        System.out.println("5일 대여료: " + truck.calculateRentalCost(5) + "원");

    }
}
