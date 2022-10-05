package com.hmdb.hmdb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hmdbRoutes {
    
  @GetMapping("/actor/{id}")
  public Actor getSingleActor(@PathVariable Integer id) {
    Actor match = null;

    for (Actor actor : Actor.actors) {
      if (actor.id == id) {
        match = actor;
      }
    }
    return match;
 }

   @GetMapping("/movie/{id}")
  public Movie getSingleMovie(@PathVariable Integer id) {
    Movie match = null;

    for (Movie movie : Movie.movies) {
      if (movie.id == id) {
        match = movie;
      }
    }

    if (match == null)
      throw new Error("Cat nout found.");

    return match;
 }

 @GetMapping("/movies")
  public ArrayList<Movie> getAllMovies() {
    return Movie.movies;
 }


  @GetMapping("/actors")
  public ArrayList<Actor> getAllActors() {
    return Actor.actors;
 }

  @PostMapping("/create-movie")
  public Movie createMovie(@RequestBody Movie movie) {
    
    return movie;
  }
  @PostMapping("/create-actor")
  public Actor createActor(@RequestBody Actor actor) {
    
    return actor;
  }
}