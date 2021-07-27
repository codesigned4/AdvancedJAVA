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
			
			City city=new City();
			city.setName("düzce");
			city.setCountryCode("TUR");
			city.setDistrict("Karadeniz");
			city.setPopulation(100000);
			
			session.save(city);	
	
			
			session.getTransaction().commit();
			System.out.println("Þehir eklendi");
		}finally {
			session.close();
		}

	}

}
