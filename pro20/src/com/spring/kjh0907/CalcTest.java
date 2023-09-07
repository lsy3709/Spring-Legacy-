package com.spring.kjh0907;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
	//AOP, ??€?Έ ?? ?΄??€
	//AOPTest.xml λΆλ¬?€? ??±?
	//proxyCal -> AOPTest.xml ??Ό ?? ?±λ‘λ λΉ? ?Έ?€?΄?€3
	
	   public static void main(String[] args){
	      ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
	      Calculator cal=(Calculator)context.getBean("proxyCal");
	      
	      //μ£ΌκΈ°?₯?΄ ?? ?? 
	      cal.add(100,20);
	      System.out.println();
	      cal.subtract(100,20);
	      System.out.println();
	      cal.multiply(100,20);
	      System.out.println();
	      cal.divide(100,20);
	   }
	}