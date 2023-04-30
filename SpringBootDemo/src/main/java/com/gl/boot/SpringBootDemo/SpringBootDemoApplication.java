package com.gl.boot.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gl.boot.SpringBootDemo.database.CustomerDB;
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(SpringBootDemoApplication.class, args);
				System.out.println("Ready");
				CustomerDB customerDB = context.getBean(CustomerDB.class);
				System.out.println(customerDB.getTemplate());
				System.out.println(customerDB.getCustomerCount());
	}

}
