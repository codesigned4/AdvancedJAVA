package springIntro;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IoCConfiguration.class);
		
		ICustomerService customerService=(ICustomerService) context.getBean("service");
		customerService.add();
		
		
	}
}
