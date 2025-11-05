package com.ll.b.oop.Practice;

public class Counter {
    int count;

    public Counter () {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void getCount() {
        System.out.println(count);
    }

    public void reset() {
        count = 0;
    }
}
