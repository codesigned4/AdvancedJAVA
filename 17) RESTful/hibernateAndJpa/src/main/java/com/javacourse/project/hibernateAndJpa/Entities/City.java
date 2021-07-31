package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="countrycode")
	private String countrCode;
	
	@Column(name="district")
	private String district;
	
	@Column(name="population")
	private int population;
	
	public City() {	}
	
	public City(int id, String name, String countrCode, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.countrCode = countrCode;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountrCode() {
		return countrCode;
	}

	public void setCountrCode(String countrCode) {
		this.countrCode = countrCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
}
