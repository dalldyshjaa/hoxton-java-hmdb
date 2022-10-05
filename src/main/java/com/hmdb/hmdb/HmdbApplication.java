package com.hmdb.hmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HmdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmdbApplication.class, args);
		Movie batman = new Movie("Batman", "Batman beats bad beople");
		Movie superman = new Movie("Superman", "Superman beats bad beople");
		Actor ben = new Actor("Ben", "Affleck", 2000, 0);
		Actor henry = new Actor("Henry", "Cavill", 2000, 1);
	}

}
