package com.example.demo.controller;

import org.springframework.web.context.ContextLoader;



public class Test {
	protected TestObj intTest(){
		System.out.println("执行");
		return new TestObj(){
			protected int innerMethod(){
				System.out.println("执行第一句");
				return 0;
				
			}
			 final Integer this$0=99999;
			 {
				 System.out.println("执行第二句："+this$0);
			 }
		};
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.intTest();
	}
}
