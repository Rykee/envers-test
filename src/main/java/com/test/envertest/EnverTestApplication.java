package com.test.envertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableEnversRepositories
public class EnverTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnverTestApplication.class, args);
	}

}
