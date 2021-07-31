package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.ArrayList;

import com.javacourse.project.hibernateAndJpa.Entities.City;

public interface ICityDal {
	ArrayList<City> GetAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
