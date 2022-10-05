package com.hmdb.hmdb;

import java.util.ArrayList;

public class Actor {
    
    public String firstName;
    public String lastName;
    public int yearOfBirth;
    public int id;
    public int movieId;
    public static int index = 0;

    public static ArrayList<Actor> actors = new ArrayList<Actor>(); 


    public Actor(String firstName, String lastName, int yearOfBirth, int movieId ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        id = index++;
        this.movieId = movieId;
        Actor.actors.add(this);
        assignActor(this);
    }
    public void assignActor(Actor obj){
        for(Movie movie: Movie.movies){
            if(movie.id == movieId){
                movie.actors.add(obj);
            }
        }
    }
}
