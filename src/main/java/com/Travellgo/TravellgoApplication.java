package com.Touristo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TouristoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristoApplication.class, args);
	}


}
