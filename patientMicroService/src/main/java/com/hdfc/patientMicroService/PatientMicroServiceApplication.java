package com.hdfc.patientMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PatientMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientMicroServiceApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {


		return new RestTemplate();
	}
}
