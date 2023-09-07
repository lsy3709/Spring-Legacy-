package com.spring.kjh0907;

public class Calculator {
	public void add(int x, int y) {
		//ì£¼ê¸°?Š¥ ?™?‘?„ ?•˜?Š” ?´?˜?Š¤ë¡? ê°?? •?•˜ê³? ì§„í–‰
		//?‚¬ì¹™ì—°?‚°?´ 
		int result=x+y;
		System.out.println("ê²°ê³¼:"+ result);
	}

	public void subtract(int x, int y) {
		int result=x - y;
		System.out.println("ê²°ê³¼:"+ result);
	}

	public void multiply(int x, int y) {
		int result=x * y;
		System.out.println("ê²°ê³¼:"+ result);
	}

	public void divide(int x, int y) {
		int result=x / y;
		System.out.println("ê²°ê³¼:"+ result);
	}
}