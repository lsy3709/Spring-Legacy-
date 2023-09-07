package com.spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
	//AOP, 테스트 하는 클래스
	//AOPTest.xml 불러오는 생성자
	//proxyCal -> AOPTest.xml 파일 안에 등록된 빈 인스턴스3
	
	   public static void main(String[] args){
	      ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
	      Calculator cal=(Calculator)context.getBean("proxyCal");
	      
	      //주기능이 되는 시점
	      cal.add(100,20);
	      System.out.println();
	      cal.subtract(100,20);
	      System.out.println();
	      cal.multiply(100,20);
	      System.out.println();
	      cal.divide(100,20);
	   }
	}