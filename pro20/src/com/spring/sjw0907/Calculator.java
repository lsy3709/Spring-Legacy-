package com.spring.sjw0907;

public class Calculator {
	public void add(int x, int y) {
		int result=x+y;
		System.out.println("add:"+ result);
	}

	public void subtract(int x, int y) {
		int result=x - y;
		System.out.println("subtract:"+ result);
	}

	public void multiply(int x, int y) {
		int result=x * y;
		System.out.println("multiply:"+ result);
	}

	public void divide(int x, int y) {
		int result=x / y;
		System.out.println("divide:"+ result);
	}
}
