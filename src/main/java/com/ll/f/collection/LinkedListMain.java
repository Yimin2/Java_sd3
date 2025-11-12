package com.ll.f.collection;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 기본 List 메서드
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list); // [A, B, C]

        // LinkedList 특화 메서드
        list.addFirst("Start"); // 맨 앞에 추가
        list.addLast("End");    // 맨 뒤에 추가
        System.out.println(list); // [Start, A, B, C, End]

        String first = list.getFirst(); // 첫 요소
        String last = list.getLast();   // 마지막 요소
        System.out.println("첫 번째: " + first + ", 마지막: " + last);

        list.removeFirst(); // 첫 요소 삭제
        list.removeLast();  // 마지막 요소 삭제
        System.out.println(list); // [A, B, C]
    }
}
