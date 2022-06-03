package com.girish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.girish.Service.Test;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(TaskApplication.class, args);
		Test bean = context.getBean(Test.class);
		bean.getInfo();
	}

}
