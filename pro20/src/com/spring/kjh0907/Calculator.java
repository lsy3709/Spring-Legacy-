package com.spring.kjh0907;

public class Calculator {
	public void add(int x, int y) {
		//μ£ΌκΈ°?₯ ??? ?? ?΄??€λ‘? κ°?? ?κ³? μ§ν
		//?¬μΉμ°?°?΄ 
		int result=x+y;
		System.out.println("κ²°κ³Ό:"+ result);
	}

	public void subtract(int x, int y) {
		int result=x - y;
		System.out.println("κ²°κ³Ό:"+ result);
	}

	public void multiply(int x, int y) {
		int result=x * y;
		System.out.println("κ²°κ³Ό:"+ result);
	}

	public void divide(int x, int y) {
		int result=x / y;
		System.out.println("κ²°κ³Ό:"+ result);
	}
}