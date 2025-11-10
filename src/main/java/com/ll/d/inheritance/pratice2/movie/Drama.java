package com.ll.d.inheritance.pratice2.movie;

public class Drama extends Movie {
    String theme;

    public Drama(String title, double rating, String theme) {
        super(title, rating);
        this.theme = theme;
    }
}
