package com.generation.inovaverde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}, scanBasePackages = "com.generation.inovaverde")
public class InovaverdeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InovaverdeApplication.class, args);
	}

}
