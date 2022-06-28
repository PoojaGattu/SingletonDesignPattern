package com.test;

public class Singleton {
	private static Singleton obj=new Singleton();//Early, instance will be created at load time
	
	private Singleton() {
		
	}
	public void doSomething(){  
		 //write your code  
		System.out.println("Singleton class");
		 }  
}
