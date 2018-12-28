package com.example.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author : Kanika Kapoor
 * Contains configurations.
 */

@SpringBootApplication
@ComponentScan("com.example")
public class ProducerConfig  {


	public static void main(String[] args) {
		SpringApplication.run(ProducerConfig.class, args);
		
	}
}
