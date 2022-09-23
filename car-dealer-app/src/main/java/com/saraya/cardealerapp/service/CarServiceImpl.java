package com.saraya.cardealerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.cardealerapp.model.Car;
import com.saraya.cardealerapp.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;

	@Override
	public List<Car> findAll() {
		return carRepository.findAll();
	}

	@Override
	public Car save(Car car) {
		carRepository.save(car);
		return car;
	}

	@Override
	public Car findById(int id)  {
		if (carRepository.findById(id).isPresent()) {
			return carRepository.findById(id).get();			
		}
		return null;
		
	}

	@Override
	public void delete(int id) {
		Car car = findById(id);
		carRepository.delete(car);
	}

	

}
