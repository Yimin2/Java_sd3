package com.ll.c.oop2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Singleton {
    private static Singleton inst = null;

    public static Singleton getInstance() {
        if(inst == null) {
            inst = new Singleton();
        }
        return inst;
    }
}
