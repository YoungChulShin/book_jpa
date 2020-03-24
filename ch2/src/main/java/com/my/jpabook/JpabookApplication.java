package com.my.jpabook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class JpabookApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpabookApplication.class, args);
	}

}
