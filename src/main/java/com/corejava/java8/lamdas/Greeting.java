package com.corejava.java8.lamdas;

/*
 * interface is required to make the application DE-COUPLED
 */
@FunctionalInterface
public interface Greeting {
	
	void performGreetings(String s);
	
	//int anyFunc(int a, int b);

}
