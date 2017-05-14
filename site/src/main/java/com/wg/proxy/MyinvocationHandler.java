package com.wg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyinvocationHandler  implements InvocationHandler{

	private Object target;
	public MyinvocationHandler(){}
	public MyinvocationHandler(Object target){
		this.target = target;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if("getName".equals(method.getName())){
			System.out.println("before getName method!");
			Object result = method.invoke(target, args);
			System.out.println("after" + method.getName()+ "method !");
			return result; 
		}else {
			Object result = method.invoke(target, args);
			return result; 
		}
	}

}
