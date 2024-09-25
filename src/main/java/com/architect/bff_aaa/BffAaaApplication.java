package com.architect.bff_aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BffAaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffAaaApplication.class, args);
	}

}
