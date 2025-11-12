package com.ll.e.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Student<T> {
    private String name;
    private T score;

    public boolean isPassing(double passingScore) {
        if (score instanceof Number) {
            double scoreValue = ((Number) score).doubleValue();
            return scoreValue > passingScore;
        }
        return false;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<Integer>("kim", 100);
        Student<Double> s2 = new Student<Double>("lee", 95.5);
        Student<String> s3 = new Student<String>("park", "B+");

        System.out.println(s1.isPassing(90));
        System.out.println(s2.isPassing(90));
        System.out.println(s3.isPassing(90));
    }
}
