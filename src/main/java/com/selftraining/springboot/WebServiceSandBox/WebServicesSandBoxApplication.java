package com.selftraining.springboot.WebServiceSandBox;

import com.selftraining.springboot.WebServiceSandBox.JavaObjects.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebServicesSandBoxApplication {

	public static Person person;

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(WebServicesSandBoxApplication.class, args);

		person = applicationContext.getBean(Person.class);
	}

}
