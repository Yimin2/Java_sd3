package com.ll.f.collection.pratice;

import com.ll.d.inheritance.pratice.person.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        // 테스트 1
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 3, 9, 1, 7));
        System.out.println("입력: " + list1);
        System.out.println("출력: " + findSecondLargest(list1));

        // 테스트 2
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 10, 10));
        System.out.println("\n입력: " + list2);
        System.out.println("출력: " + findSecondLargest(list2));

        // 테스트 3
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 5, 3, 3, 1));
        System.out.println("\n입력: " + list3);
        System.out.println("출력: " + findSecondLargest(list3));

        // 테스트 4
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(5));
        System.out.println("\n입력: " + list4);
        System.out.println("출력: " + findSecondLargest(list4));
    }

    public static int findSecondLargest(ArrayList<Integer> list) {
        if (list.isEmpty() || list.size() < 2) {
            return -1;
        }
        int max= -1, max2=-1;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==max) {

            } else if(list.get(i)> max) {
                max2 = max;
                max = list.get(i);
            } else if(list.get(i)> max2) {
                max2= list.get(i);
            }
        }
        return max2;
    }
}
