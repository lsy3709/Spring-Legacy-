package com.spring.sjw0907;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[메서드 호출 전 : LogginAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 전");

		Object object = invocation.proceed();

		System.out.println(" 손주원 과제 ");
		System.out.println(invocation.getMethod() + "메서드 호출 후");
		return object;
	}
}
