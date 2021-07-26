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
		
		ArrayList<String> cityNames=(ArrayList<String>) session.createQuery("SELECT c.name FROM City c ORDER BY c.name").getResultList();//map ettiðimiz nesneden çekiyoruz
																																	        //veritabanýndaki tablodan deðil
		
		for(String cityName:cityNames) {
			System.out.println(cityName);
		}
		
		session.getTransaction().commit();
		}finally {
			session.close();
		}

	}

}
