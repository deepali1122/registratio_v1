package com.api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RegistrationApplication {
    //now its working ma'am ok wait let me check

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}
@Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}



