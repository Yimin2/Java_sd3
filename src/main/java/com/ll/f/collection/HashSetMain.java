package com.ll.f.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println(set); // [Banana, Apple, Cherry] (순서 무작위)

        // 중복 추가 시도
        boolean added = set.add("Apple");
        System.out.println("Apple 추가 성공? " + added); // false
        System.out.println(set); // 변화 없음

        // 포함 여부 확인
        System.out.println("Banana 포함? " + set.contains("Banana")); // true

        // 요소 삭제
        set.remove("Banana");
        System.out.println(set);

        // 크기 확인
        System.out.println("크기: " + set.size());

        // 비어있는지 확인
        System.out.println("비어있음? " + set.isEmpty());

        // 모든 요소 삭제
        set.clear();
        System.out.println("clear 후: " + set);

        Set<Integer> intSet1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> intSet2 = new HashSet<>(Arrays.asList(6,7,8,9,10));

        intSet1.addAll(intSet2);
        intSet1.retainAll(intSet2);
    }
}
