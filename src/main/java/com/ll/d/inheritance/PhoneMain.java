package com.ll.d.inheritance;

import javax.swing.*;

public class PhoneMain {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.brand = "apple";
        iphone.model = "16pro";
        iphone.powerOn();
        iphone.charge();

        Galaxy galaxy = new Galaxy();
        galaxy.brand = "samsung";
        galaxy.model = "s25";
        galaxy.powerOn();
    }
}

// 부모 클래스
class Phone {
    String brand;
    String model;
    int batteryLevel;

    void powerOn() {
        System.out.println(model + " is powering on");
    }

    void charge() {
        batteryLevel = 100;
        System.out.println("충전완료");
    }
}

// 자식 클래스
class Iphone extends Phone {
    String ios;
}

// 자식 클래스
class Galaxy extends Phone {
    String android;
}
