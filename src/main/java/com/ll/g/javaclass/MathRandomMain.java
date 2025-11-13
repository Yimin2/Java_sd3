package com.ll.g.javaclass;

import java.util.*;

public class MathRandomMain {
    public static void main(String[] args) {
        System.out.println(Math.min(10,20));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(16));

        Random random = new Random();

        int num = random.nextInt(1,40);
        System.out.println(num);

        int dice = random.nextInt(6)+1;
        System.out.println(dice);

        Set<Integer> uniqueNumber = new HashSet<>();

        while (uniqueNumber.size()<6) {
            int num1 = random.nextInt(45)+1;
            uniqueNumber.add(num1);
        }
        System.out.println(uniqueNumber);
        List<Integer> lotto = new ArrayList<>(uniqueNumber);
        lotto.sort(Comparator.naturalOrder());
        System.out.println(lotto);
    }
}
