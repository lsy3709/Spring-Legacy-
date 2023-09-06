package com.spring.ssy0906;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
		//xml파일을 불러오는 생성자
	
	   public static void main(String[] args){
	      ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
	      Calculator cal=(Calculator)context.getBean("proxyCal"); // Calculator 형으로 형변환 
	      
	      
	      //주기능이 실행되는 시점 
	      cal.add(100,20);
	      System.out.println();
	      cal.subtract(100,20);
	      System.out.println();
	      cal.multiply(100,20);
	      System.out.println();
	      cal.divide(100,20);
	   }
	}
