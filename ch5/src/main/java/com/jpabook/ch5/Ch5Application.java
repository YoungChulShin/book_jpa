package com.jpabook.ch5;

import com.jpabook.ch5.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class Ch5Application {

	@Autowired
	EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(Ch5Application.class, args);

	}

}
