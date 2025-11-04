package com.ll.a.basic;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("================== 구구단 ==================");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
        System.out.println("================== 별찍기 ==================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("================== 별 찍기 패턴 2 ==================");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("================== 별 찍기 패턴 3 ==================");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("================== 약수 구하기 ==================");

        int num1 = 33;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();

        System.out.println("================== 소수 판별 ==================");

        int num2 = 17;
        boolean bool1 = true;
        for (int i = 2; i < num2; i++) {
            if (num2 % i == 0) {
                System.out.println("소수가 아닙니다.");
                bool1 = false;
                break;
            }
        }
        if (bool1) {
            System.out.printf("%d 소수 입니다\n", num2);
        }

        System.out.println("================== 소수 판별 최적화 ==================");
        int num3 = 17;
        boolean bool2 = true;
        for (int i = 2; i * i < num2; i++) {
            if (num2 % i == 0) {
                System.out.println("소수가 아닙니다.");
                bool2 = false;
                break;
            }
        }
        if (bool2) {
            System.out.printf("%d 소수 입니다\n", num3);
        }

        System.out.println("================== 최대공약수 (GCD) ==================");
        System.out.println(gcd(48, 18));
        System.out.println("================== 최소공배수 (LCM) ==================");
        System.out.println(LCM(12, 18));
        System.out.println("================== 피보나치 수열 ==================");
        int num4 = 10;
        int sum1 = 0, sum2 = 1, sum3 = 0;
        for (int i = 1; i < num4; i++) {
            sum1 = sum2;
            sum2 = sum3;
            sum3 = sum1 + sum2;
        }
        System.out.println(sum3);
        System.out.println("================== 팩토리얼 ==================");
        int num5 = 5;
        int factorial = 1;
        for (int i = num5; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
        System.out.println("================== 역순 숫자 출력 ==================");
        int num6 = 12345;
        int result2 = 0;
        while (num6 > 0) {
            result2 += num6 % 10;
            if (num6 > 10) {
                result2 *= 10;
            }
            num6 /= 10;
        }
        System.out.println(result2);
        System.out.println("================== 숫자 자릿수 합 ==================");
        int num7 = 12345;
        int result3 = 0;
        while (num7 > 0) {
            result3 += num7 % 10;
            num7 /= 10;
        }
        System.out.println(result3);
        System.out.println("================== 구구단 특정 단 건너뛰기 ==================");
        outer:
        for (int i = 2; i <= 9; i++) {
            if (i == 5) {
                continue outer;  // 외부 반복의 다음 단계로
            }
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println("내부 반복 종료");
        }
    }

    private static int LCM(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
