package com.example.schoolapibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SchoolApiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApiBackendApplication.class, args);
	}

}
