package com.example.demo.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8657005199491190236L;
	
	@Value("${server.port}")
	String port;
	@RequestMapping(value = "/A")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:"+ port;
	}
	@RequestMapping(value = "/")
	public String home1() {
		return "hi,i am home "  ;
	}
}
