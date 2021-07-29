package hibernateIntro;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			
			City city=session.get(City.class, 4080);
			session.delete(city);	
			
			session.getTransaction().commit();
			System.out.println("Þehir silindi");
		}finally {
			session.close();
		}

	}

}
