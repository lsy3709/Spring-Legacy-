package com.spring.kjh0907;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
	//AOP, ?Öå?ä§?ä∏ ?ïò?äî ?Å¥?ûò?ä§
	//AOPTest.xml Î∂àÎü¨?ò§?äî ?Éù?Ñ±?ûê
	//proxyCal -> AOPTest.xml ?åå?ùº ?ïà?óê ?ì±Î°ùÎêú Îπ? ?ù∏?ä§?Ñ¥?ä§3
	
	   public static void main(String[] args){
	      ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
	      Calculator cal=(Calculator)context.getBean("proxyCal");
	      
	      //Ï£ºÍ∏∞?ä•?ù¥ ?êò?äî ?ãú?†ê
	      cal.add(100,20);
	      System.out.println();
	      cal.subtract(100,20);
	      System.out.println();
	      cal.multiply(100,20);
	      System.out.println();
	      cal.divide(100,20);
	   }
	}