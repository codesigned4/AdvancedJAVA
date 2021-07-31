package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.ArrayList;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;

//Hibernate de Spring de Standrt olarak JPA yı implement ediyor
//Hibernat dersinde oluşturduğumuz SessionFactory ve session nesnesi
//bizim için burada otomatik olarak injectionla JPA yı kullanarak oluşacak  

@Repository
public class HibernateCityDal implements ICityDal{

	//Buradaki EntityManager JPA dan gelen ve Sessiona karşılık gelen classdır
	private EntityManager entityManager;
	
	//SessionFactory i otomatik olarak enjekte ediyoruz
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public ArrayList<City> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		ArrayList<City> cities=(ArrayList<City>)session.createQuery("FROM City",City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}

	@Override
	public void update(City city) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}

	@Override
	public void delete(City city) {
		Session session=entityManager.unwrap(Session.class);
		City cityToDelete=session.get(City.class,city.getId());
		session.delete(cityToDelete);		
	}

	@Override
	public City getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		City city=session.get(City.class, id);
		return city;
	}

}
