package com.generics.examples;

public class GenericClass {

	public static void main(String[] args) {
	      Box<Integer> integerBox = new Box<Integer>();
	      Box<String> stringBox = new Box<String>();
	    
	      integerBox.setT(new Integer(10));
	      stringBox.setT(new String("Hello World"));

	      System.out.printf("Integer Value :%d\n\n", integerBox.getT());
	      System.out.printf("String Value :%s\n", stringBox.getT());
	   }
	
}
