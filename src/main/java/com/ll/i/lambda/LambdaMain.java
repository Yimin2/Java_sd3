package com.ll.i.lambda;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Calculator {
    int calculator(int a, int b);
}

public class LambdaMain {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        Comparator<Integer> comparator1 = (a, b) -> Integer.compare(a, b);

        // 매개변수 x
        Runnable task = () -> System.out.println("실행");
        task.run();
        System.out.println(task);

        // 매개변수 1
        Consumer<String> print = (s) -> System.out.println(s);
        print.accept("hi");

        // 매개변수 2
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(1, 3));

        BiFunction<Integer, Integer, Integer> cal = (a, b) -> {
            int sum = a + b;
            return sum / 2;
        };
        System.out.println(cal.apply(1, 3));

        Calculator cal1 = (a, b) -> a + b;

        Supplier<String> s = () -> "hello";
        System.out.println(s.get());

        Consumer<String> c = str -> System.out.println(str);
        c.accept("hi");

        Function<String, Integer> f = str -> str.length();
        System.out.println(f.apply("hello"));

        // :: 메서드 참조

        Function<String, Integer> parser1 = str -> Integer.parseInt(str);
        Function<String, Integer> parser2 = Integer::parseInt;

        int result = parser2.apply("123");
        System.out.println(result);

        String prefix = "hihi";
        Function<String, String> greeter1 = name -> prefix.concat(name);
        Function<String, String> greeter2 = prefix::concat;
        String helloResult = greeter1.apply(" kim");
        System.out.println(helloResult);
    }
}
