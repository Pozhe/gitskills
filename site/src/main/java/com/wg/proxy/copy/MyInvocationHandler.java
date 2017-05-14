package com.wg.proxy.copy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	private Object target;
	public MyInvocationHandler(){}
	public MyInvocationHandler(Object target){
		this.target = target;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().equals("getName")){
			System.out.println("before " +method.getName() + " method!" );
			Object model = method.invoke(target, args);
			System.out.println("after " +method.getName() + " method!" );
			return model;
		}else 
		{
			Object model = method.invoke(target, args);
			return model;
		}

	}

}
