package com.ll.g.javaclass;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        System.out.println(str1 == str2); // 객체 생성하면 같지 않음

        String str3 = "HELLO";
        System.out.println(str1.equals(str2)); // 문자열 비교
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3)); // 대소문자 무시


        System.out.println(str3.replace("HELLO", "world"));
        String[] strSplit = str2.split("l", 2);
        System.out.println(strSplit[0] + strSplit[1]);

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(3);
        sb.append(5);

        System.out.println(sb.toString());
    }
}
