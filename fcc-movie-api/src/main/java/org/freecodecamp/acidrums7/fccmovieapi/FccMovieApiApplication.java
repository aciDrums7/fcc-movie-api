package org.freecodecamp.acidrums7.fccmovieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FccMovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FccMovieApiApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World!";
	}

}
