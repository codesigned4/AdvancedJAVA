package com.spring;


import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerDal customerDal=(ICustomerDal) context.getBean("database");
		customerDal.add();
	
	}

}
