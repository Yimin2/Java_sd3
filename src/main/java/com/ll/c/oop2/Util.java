package com.ll.c.oop2;

public class Util {

    public static void main(String[] args) {
        Util u = new Util();

        String result = u.concat("사과", "바나나", "포도");
        System.out.println(result);
    }

    private String concat(String... strings) {
        StringBuilder sb = new StringBuilder();

        for(String data : strings) {
            sb.append(data);
            sb.append(" ");
        }
        return sb.toString();
    }
}
