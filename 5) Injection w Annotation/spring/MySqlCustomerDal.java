package com.spring;

import org.springframework.stereotype.Component;

@Component("database")
public class MySqlCustomerDal implements ICustomerDal{
	
	public void add() {
		System.out.println("Veriniz MySql veritabanýna eklendi");
	}
	
}
