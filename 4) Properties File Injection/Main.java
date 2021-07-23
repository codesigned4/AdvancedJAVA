package springIntro;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			DBConnection dbConnection=(DBConnection) context.getBean("database");
			dbConnection.open();
			
			System.out.println("\n----------------------------\n");
			
			dbConnection.close();
		
		} catch (BeansException e) {
			e.printStackTrace();
		}	
	}
}
