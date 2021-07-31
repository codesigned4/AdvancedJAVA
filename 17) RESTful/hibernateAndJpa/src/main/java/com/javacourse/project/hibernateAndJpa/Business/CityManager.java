package com.javacourse.project.hibernateAndJpa.Business;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICityDal;
import com.javacourse.project.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService{

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Transactional
	public ArrayList<City> GetAll() {
		return this.cityDal.GetAll();
	}

	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
		
	}

	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
	}

	@Transactional
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
