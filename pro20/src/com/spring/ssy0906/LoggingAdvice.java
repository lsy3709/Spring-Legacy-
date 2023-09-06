package com.spring.ssy0906;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//��������� �ϴ� Ŭ������ ������ ����ü . aspect :  ������� 
//advice : aspect�� ���� ����ä 
// �ֱ���� �����ϱ� ������ 

//������ ������ ��ũ���� �����ϴ� �������̽��� �̿��ϴ¹�� 
public class LoggingAdvice implements MethodInterceptor {
	// �ֱ�� �޼����� 1) ������ 2) ������ 3) ���ܹ߻����� �����̵Ǵ� �޼��� 
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[�޼��� ȣ�� �� : LogginAdvice");
		System.out.println(invocation.getMethod() + "�޼��� ȣ�� ��");

		//��������Ʈ ( �������� ������ ) object = null�� ���� 
		Object object = invocation.proceed();

		System.out.println("[�޼��� ȣ�� �� : loggingAdvice");
		System.out.println(invocation.getMethod() + "�޼��� ȣ�� ��");
		return object;
	}
}
// �������̽��� �ִ� invoke �� ������ �� 
//public Object invoke(MethodInvocation invocation) throws Throwable {
//	return invocation;
//�̳��� 
// �ش�޼��� ( �ֱ�� ) �� ������ / �� ���ܹ߻��� ���� 
