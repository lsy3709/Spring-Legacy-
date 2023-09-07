package com.spring.scb0906;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


//보조기능을 나타내는 클래스. 실제 구현체
//aspect :보조기능
//advice : 위에 aspect의 실제 구현체(클래스)
//AOP -> 전 과 후 -> 주기능이 동작 하기 전과 후
//구현 방법에 대해서 2가지
//스프링 프레임 워크에서 제공하는 인터페이스를 이용하는 방법

public class LoggingAdvice implements MethodInterceptor {
	//주기능 메서드의 1)실행 전 2)실행 후 3) 예외발생, 
	//실행이 되는 메서드
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("메서드 호출 전 : LogginAdvice ");
		System.out.println(invocation.getMethod() + "메서드 호출 전");
		
		//object => null 로 잡힘.
		Object object = invocation.proceed();

		System.out.println("메서드 호출 후  : loggingAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 후");
		return object;
	}
}
