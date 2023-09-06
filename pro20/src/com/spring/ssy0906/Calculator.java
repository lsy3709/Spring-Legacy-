package com.spring.ssy0906;

public class Calculator {
	public void add(int x, int y) {
		int result=x+y;
		System.out.println("add결과:"+ result);
	}

	public void subtract(int x, int y) {
		int result=x - y;
		System.out.println("subtract결과:"+ result);
	}

	public void multiply(int x, int y) {
		int result=x * y;
		System.out.println("multiply결과:"+ result);
	}

	public void divide(int x, int y) {
		int result=x / y;
		System.out.println("divide결과:"+ result);
	}
}
