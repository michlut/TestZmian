package com.rentcar.office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OfficeApplication {

	@Autowired
	private static User user;

	public static void main(String[] args) {
		SpringApplication.run(OfficeApplication.class, args);

	}

}
