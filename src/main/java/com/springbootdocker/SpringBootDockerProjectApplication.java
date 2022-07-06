package com.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerProjectApplication
{

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome from the Dockerized Springboot Application!!";
	}

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootDockerProjectApplication.class, args);
	}

}
