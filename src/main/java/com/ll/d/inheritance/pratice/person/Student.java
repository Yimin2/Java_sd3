package com.ll.d.inheritance.pratice.person;

public class Student extends Person {
    //Student 클래스: studentId, major 필드 추가
    //Student의 생성자는 모든 필드를 초기화
    //introduce() 메서드를 오버라이딩하여 학생 정보 출력
    int studentId;
    String major;

    public Student(String name, int age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void introduce () {
        System.out.println(name + age + studentId + major);
    }
}
