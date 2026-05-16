package com.example.EcommerceSpring;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load();  //load env variable from the .env file
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
		//set system properties from env variables and set them

		SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}

