package com.douzone.springbootex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * Bootstrap Class
 */
@SpringBootApplication
public class HellowordApplication {
	public static void main(String[] arg) {
		
		// 부트스트렙 클래스가 하는 5가지 일을 해주고 HellowordApplication이 config 설정을 해준다
		SpringApplication.run(HellowordApplication.class, arg);
	}
}
