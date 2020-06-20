package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.blog","com.user","com.GeneralServices"})
public class MyStroryMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyStroryMartApplication.class, args);
	}

}
