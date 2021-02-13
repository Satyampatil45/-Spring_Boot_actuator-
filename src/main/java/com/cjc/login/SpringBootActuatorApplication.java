package com.cjc.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorApplication {

	public static void main(String[] args) 
	{
		System.out.println("spring boot actuator ");
		SpringApplication.run(SpringBootActuatorApplication.class, args);
	}

}
