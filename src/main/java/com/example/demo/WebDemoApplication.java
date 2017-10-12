package com.example.demo;

import java.util.Stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties
public class WebDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(WebDemoApplication.class, args);
		Stack s=new Stack();
		String a1="aaa";
		String a2="bbb";
		String a3="ccc";
		String q1=(String) s.push(a1);
		String q2=(String) s.push(a2);
		String q3=(String) s.push(a3);
		System.out.println(q1+q2+q3);
		String w1=(String) s.pop();
		String w2=(String) s.pop();
		String w3=(String) s.pop();
		System.out.println(w1+w2+w3);
	}
}
