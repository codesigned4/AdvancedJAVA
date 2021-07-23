package springIntro;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			ICustomerService customerManager=context.getBean("service",ICustomerService.class);
			customerManager.add();
	
		}catch (BeansException e) {}
		
	}
	
}
