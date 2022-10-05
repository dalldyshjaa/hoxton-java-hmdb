package com.hmdb.hmdb;

import java.util.ArrayList;

public class Movie {
    public int id;
    public String title;
    public String desc;
    public ArrayList<Actor> actors; 


    public static int index = 0;
    public static ArrayList<Movie> movies = new ArrayList<Movie>();

    public Movie(String title, String desc){
        this.title = title;
        this.desc = desc;
        id = index++;
        actors = new ArrayList<Actor>();
        Movie.movies.add(this);
    }

    
}
