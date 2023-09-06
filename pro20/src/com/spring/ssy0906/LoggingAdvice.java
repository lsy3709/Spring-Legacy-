package com.spring.ssy0906;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//보조기능을 하는 클래스고 실제로 구현체 . aspect :  보조기능 
//advice : aspect의 실제 구현채 
// 주기능이 동작하기 전과후 

//스프링 프레임 워크에서 제공하는 인터페이스를 이용하는방법 
public class LoggingAdvice implements MethodInterceptor {
	// 주기능 메서드의 1) 실행전 2) 실행후 3) 예외발생에도 실행이되는 메서드 
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[메서드 호출 전 : LogginAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 전");

		//조인포인트 ( 기점으로 전과후 ) object = null로 잡힘 
		Object object = invocation.proceed();

		System.out.println("[메서드 호출 후 : loggingAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 후");
		return object;
	}
}
// 인터페이스에 있는 invoke 를 재정의 함 
//public Object invoke(MethodInvocation invocation) throws Throwable {
//	return invocation;
//이내용 
// 해당메서드 ( 주기능 ) 의 실행전 / 후 예외발생시 실행 
