package com.saraya.cardealerapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_dealer_app")
public class Car {
	
	@Id
	@GeneratedValue
	private int id;
	private String brand;
	private String model;
	private String fuel;
	private int km;
	private int year;
	
	public Car() {}

	public Car(int id, String brand, String model, String fuel, int km, int year) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.fuel = fuel;
		this.km = km;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
