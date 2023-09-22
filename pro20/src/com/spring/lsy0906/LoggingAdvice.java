package com.spring.lsy0906;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// ������� Ŭ���� , MethodInterceptor �������̽� ���� ��, �߻� �޼��� �ǹ��� ������
public class LoggingAdvice implements MethodInterceptor {
	// �ֱ���� 1) ���� �Ǳ� ��, 2) ���� �Ǳ� ��, 3) ���ܹ߻��� 
	// �� invoke �޼��尡 �����̵�. �׷��� �����. 
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[�޼��� ȣ�� �� : LogginAdvice");
		System.out.println(invocation.getMethod() + "�޼��� ȣ�� ��");

		Object object = invocation.proceed();

		System.out.println("[�޼��� ȣ�� �� : loggingAdvice");
		System.out.println(invocation.getMethod() + "�޼��� ȣ�� ��");
		return object;
	}
}
