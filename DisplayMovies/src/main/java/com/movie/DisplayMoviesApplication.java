package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.movie")
public class DisplayMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayMoviesApplication.class, args);
	}

}
