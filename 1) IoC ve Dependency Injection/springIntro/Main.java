package springIntro;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			CustomerManager manager=new CustomerManager(context.getBean("database",ICustomerDal.class));
			manager.add();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
}
