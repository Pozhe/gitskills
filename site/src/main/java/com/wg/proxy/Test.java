package com.wg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String []args){
		UserService userService = new UserServiceImp();
		InvocationHandler invocationHandler = new MyinvocationHandler(userService);
		UserService proxyService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
				userService.getClass().getInterfaces(), invocationHandler
				);
		System.out.println(proxyService.getName());
		System.out.println(proxyService.getAge());
		System.out.println(proxyService.getClass());
	}
	
}
