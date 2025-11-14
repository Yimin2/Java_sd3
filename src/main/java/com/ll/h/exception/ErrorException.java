package com.ll.h.exception;

import java.io.FileReader;
import java.io.IOException;

public class ErrorException {
    public static void main(String[] args) throws IOException {
        // recursiveMethod(); 재귀 오류

        try {
            int result = 10 / 0;  // ArithmeticException 오류
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        String str = null;
        // System.out.println(str.length()); nullPointException

        int[] arr = {1, 2, 3};
        // System.out.println(arr[99]); ArrayIndexOutOfBoundsException

        // int num = Integer.parseInt("asdf"); NumberFormatException

        int age = 10;
        if (age < 0) {
            throw new IllegalArgumentException("나이는 0 이상");
        }

        /*try {
            FileReader fr = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        /*try {
            int result = 1/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }*/


        FileReader fr = null;

        /*try {
            fr = new FileReader("data.txt");
            fr.read();
            System.out.println("성공!");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            fr.close();
        }*/

        try {
            String input = "123";
            int num = Integer.parseInt(input);
            int result = 100 / num;
            FileReader f = new FileReader("test.txt");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static void recursiveMethod() {
        recursiveMethod();
    }
}
