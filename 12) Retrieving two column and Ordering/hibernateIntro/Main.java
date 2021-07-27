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
		
		ArrayList<Object[]> cityNames=(ArrayList<Object[]>) session.createQuery("SELECT c.name,c.id FROM City c ORDER BY c.id").getResultList();//map ettiðimiz nesneden çekiyoruz
																																	        //veritabanýndaki tablodan deðil
		
		for(Object[] cityName:cityNames) {
			System.out.print(cityName[0]+" ");
			System.out.println(cityName[1]);

		}
		System.out.println("SIZE "+cityNames.size());
		session.getTransaction().commit();
		}finally {
			session.close();
		}

	}

}
