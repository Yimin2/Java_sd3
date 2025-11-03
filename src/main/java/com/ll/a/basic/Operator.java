package com.ll.a.basic;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a%b);

        a += b;
        System.out.println(a);

        // 단락 평가
        int x = 0;
        if (x != 0 && 10 / x > 1) {
            System.out.println("실행");
        }
    }
}
