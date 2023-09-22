package com.spring.lsy0906;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
	   public static void main(String[] args){
		   // xml ���Ͽ� �ִ� ��(�ν��Ͻ�) proxyCal �� �ҷ���
	      ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
	      Calculator cal=(Calculator)context.getBean("proxyCal");
	      
	      // �ֱ��, ��������� ���� ���� �ν��Ͻ� proxyCal �� �ҷ���, cal �� �Ҵ� 
	      // �׸��� �����, �ֱ�� ���� ��, �Ŀ� , ��������� �α� �����̽��� ������ �Ǵ� ����.
	      cal.add(100,20);
	      System.out.println();
	      cal.subtract(100,20);
	      System.out.println();
	      cal.multiply(100,20);
	      System.out.println();
	      cal.divide(100,20);
	   }
	}

