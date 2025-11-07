package com.ll.c.oop2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(1,3);
        int result1 = calculator.add(1,3,5);
        int result2 = calculator.add(1,3,5,6,7,8,9);
        calculator.printResult(result);
        calculator.printResult(result1);
        calculator.printResult(result2);

        Person person = new Person();
        Person person1 = new Person("kim", 3);

        Rectangle rectangle = new Rectangle(2, 6);

        System.out.println(rectangle.getHeight());

        User user = new User("홍길동",30);
        user.setUsername("김길동");
        System.out.println(user.getUsername());
    }
}
