package com.wg.proxy.copy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;



public class Test {

	public static void main(String []args){
		IUserService userService = new UserServiceImp();
		InvocationHandler invocationHandler = new MyInvocationHandler(userService);
		IUserService service = (IUserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), 
				userService.getClass().getInterfaces(), invocationHandler);
		service.getName();
	}
}
