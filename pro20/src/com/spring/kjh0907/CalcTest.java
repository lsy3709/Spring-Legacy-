package com.spring.kjh0907;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
	//AOP, ?��?��?�� ?��?�� ?��?��?��
	//AOPTest.xml 불러?��?�� ?��?��?��
	//proxyCal -> AOPTest.xml ?��?�� ?��?�� ?��록된 �? ?��?��?��?��3
	
	   public static void main(String[] args){
	      ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
	      Calculator cal=(Calculator)context.getBean("proxyCal");
	      
	      //주기?��?�� ?��?�� ?��?��
	      cal.add(100,20);
	      System.out.println();
	      cal.subtract(100,20);
	      System.out.println();
	      cal.multiply(100,20);
	      System.out.println();
	      cal.divide(100,20);
	   }
	}