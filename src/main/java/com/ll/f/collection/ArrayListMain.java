package com.ll.f.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); // [Apple, Banana, Cherry]

        // 특정 위치에 추가
        list.add(1, "Mango");
        System.out.println(list); // [Apple, Mango, Banana, Cherry]

        // 요소 가져오기
        String first = list.get(0);
        System.out.println("첫 번째: " + first);

        // 요소 수정
        list.set(0, "Avocado");
        System.out.println(list); // [Avocado, Mango, Banana, Cherry]

        // 요소 삭제
        list.remove(1); // 인덱스로 삭제
        list.remove("Cherry"); // 값으로 삭제
        System.out.println(list); // [Avocado, Banana]

        // 크기 확인
        System.out.println("크기: " + list.size());

        // 비어있는지 확인
        System.out.println("비어있음? " + list.isEmpty());

        // 포함 여부 확인
        System.out.println("Banana 포함? " + list.contains("Banana"));

        ArrayList<Integer> numbers = new ArrayList<>();

        // addAll: 여러 요소 추가
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers);

        // indexOf: 첫 번째 인덱스 찾기
        int index = numbers.indexOf(3);
        System.out.println("3의 인덱스: " + index);

        // lastIndexOf: 마지막 인덱스 찾기
        numbers.add(3); // 중복 추가
        System.out.println("3의 마지막 인덱스: " + numbers.lastIndexOf(3));

        // subList: 부분 리스트
        List<Integer> subList = numbers.subList(1, 4); // 1~3 (4는 포함 안 됨)
        System.out.println("부분 리스트: " + subList);

        // clear: 모든 요소 삭제
        ArrayList<String> temp = new ArrayList<>(Arrays.asList("A", "B", "C"));
        temp.clear();
        System.out.println("clear 후: " + temp);

        // toArray: 배열로 변환
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("배열: " + Arrays.toString(array));

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        // 1. for-each 문
        System.out.println("=== for-each ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. 인덱스 기반 for 문
        System.out.println("\n=== 인덱스 for ===");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + ": " + fruits.get(i));
        }

        // 3. Iterator
        System.out.println("\n=== Iterator ===");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // 4. forEach 메서드 (Java 8+)
        System.out.println("\n=== forEach ===");
        fruits.forEach(fruit -> System.out.println(fruit));

        // 5. Stream (Java 8+)
        System.out.println("\n=== Stream ===");
        fruits.stream().forEach(System.out::println);

    }
}
