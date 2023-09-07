package com.spring.scb0906;

public class Calculator {
	public void add(int x, int y) {
		//주기능 동작을 하는 클래스로 가정하고 진행
		//사칙연산이 
		int result=x+y;
		System.out.println("결과:"+ result);
	}

	public void subtract(int x, int y) {
		int result=x - y;
		System.out.println("결과:"+ result);
	}

	public void multiply(int x, int y) {
		int result=x * y;
		System.out.println("결과:"+ result);
	}

	public void divide(int x, int y) {
		int result=x / y;
		System.out.println("결과:"+ result);
	}
}
