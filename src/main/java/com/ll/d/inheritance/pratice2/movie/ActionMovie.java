package com.ll.d.inheritance.pratice2.movie;

public class ActionMovie extends Movie{
    String specialEffects;

    public ActionMovie(String title, double rating, String specialEffects) {
        super(title, rating);
        this.specialEffects = specialEffects;
    }
}
