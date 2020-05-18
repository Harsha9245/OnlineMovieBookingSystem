package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.movie")
public class MovieBookinghSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieBookinghSystemApplication.class, args);
	}

}
