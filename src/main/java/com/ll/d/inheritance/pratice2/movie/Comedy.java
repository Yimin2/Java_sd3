package com.ll.d.inheritance.pratice2.movie;

public class Comedy extends Movie {
    String humorStyle;

    public Comedy(String title, double rating, String humorStyle) {
        super(title, rating);
        this.humorStyle = humorStyle;
    }
}
