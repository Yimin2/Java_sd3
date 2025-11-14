package com.ll.i.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = 0;
        for (Integer item : list) {
            if (item % 2 == 0) {
                sum += item * item;
            }
        }
        System.out.println(sum);

        int sum1 = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum1);

        List<String> nameList = Arrays.asList("kim", "lee");

        Stream<String> nameStream = nameList.stream();
        String[] nameArray = {"a", "b", "c"};
        Stream<String> nameStream2 = Arrays.stream(nameArray);

        List<Integer> numbers = Arrays.asList(5, 3, 1, 7, 5, 3, 2, 1, 4, 6, 8);

        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 5)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filtered);

        List<String> words = Arrays.asList("apple", "banna", "cherry");
        List<String> longWords = words.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(longWords);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squares);

        List<String> upper = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);

        List<Integer> sorted = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sorted);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map);

        int result = numbers.stream()
                .reduce(1, (a, b) -> a + b);

        System.out.println(result);
    }
}
