package com.ll.d.inheritance.pratice2.movie;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    String title;
    double rating;


    public static void displayInfo(Movie movies) {
        if(movies instanceof ActionMovie) {
            System.out.println(movies.title + movies.rating + ((ActionMovie) movies).specialEffects);
        } else if (movies instanceof Comedy) {
            System.out.println(movies.title + movies.rating + (((Comedy) movies).humorStyle));
        } else {
            System.out.println(movies.title + movies.rating + (((Drama) movies).theme));
        }
    }

    public static void main(String[] args) {
        Movie[] movies = {
                new ActionMovie("어벤져스", 4.5, "최고급 CG"),
                new Comedy("극한직업", 4.7, "상황 코미디"),
                new Drama("기생충", 4.9, "계급 갈등")
        };

        for (Movie movie : movies) {
            movie.displayInfo(movie);
        }

    }

}
