package com.example.firstproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@SpringBootApplication
@PropertySource("classpath:secrets.properties")
@Slf4j
public class FirstprojectApplication {

	@Value("${my-secret-property}")
	private String secretKeyValue;

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@PostConstruct
	public void getProp() {
		log.error("---- secretKeyValue {} -----", secretKeyValue);
	}
}
