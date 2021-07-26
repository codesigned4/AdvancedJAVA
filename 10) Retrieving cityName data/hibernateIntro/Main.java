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
		
		ArrayList<City> cities=(ArrayList<City>) session.createQuery("FROM City").getResultList();//map ettiðimiz nesneden çekiyoruz
																								  //veritabanýndaki tablodan deðil
		
		for(City city:cities) {
			System.out.println(city.getName());
		}
		
		session.getTransaction().commit();
		}finally {
			session.close();
		}

	}

}
