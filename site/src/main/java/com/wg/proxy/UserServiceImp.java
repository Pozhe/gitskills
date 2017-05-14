package com.wg.proxy;

public class UserServiceImp implements UserService{

	public String getName() {
		System.out.println("this is getName method !");
		return "tom";
	}

	public int getAge() {
		System.out.println("this is getAge method !");
		return 10;
	}

}
