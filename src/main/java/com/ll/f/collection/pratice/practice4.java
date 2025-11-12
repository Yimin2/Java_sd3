package com.ll.f.collection.pratice;

import com.ll.c.oop2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice4 {
    public static void main(String[] args) {
        // 테스트 1
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 2, 1, 3, 1));
        System.out.println("입력: " + list1);
        System.out.println("출력: " + countFrequency(list1));

        // 테스트 2
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5));
        System.out.println("\n입력: " + list2);
        System.out.println("출력: " + countFrequency(list2));

        // 테스트 3
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\n입력: " + list3);
        System.out.println("출력: " + countFrequency(list3));

        // 테스트 4
        ArrayList<Integer> list4 = new ArrayList<>();
        System.out.println("\n입력: " + list4);
        System.out.println("출력: " + countFrequency(list4));
    }

    public static ArrayList<ArrayList<Integer>> countFrequency(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            if (i > list.indexOf(list.get(i))) {

            } else {
                for (int j = i; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }
                newList.add(new ArrayList<>(List.of(list.get(i), count)));
            }
        }
        return newList;
    }
}
