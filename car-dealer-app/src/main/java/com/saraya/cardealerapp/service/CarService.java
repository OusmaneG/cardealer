package com.saraya.cardealerapp.service;


import java.util.List;

import com.saraya.cardealerapp.model.Car;



public interface CarService {
	
	List<Car>findAll();
	
	Car save(Car car);
	
	Car findById(int id);
	
	void delete(int id);
	

}
