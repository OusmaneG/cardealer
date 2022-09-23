package com.saraya.cardealerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.cardealerapp.model.Car;
import com.saraya.cardealerapp.service.CarService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1")
public class CarController {
	
	@Autowired
	private CarService service;
	
	
	@GetMapping("/car")
	public ResponseEntity<List<Car>> get() {
		List<Car> car = service.findAll();
		return new ResponseEntity<List<Car>>(car, HttpStatus.OK);
	}
	
	@PostMapping("/car")
	public ResponseEntity<Car> save(@RequestBody Car car) {
		Car carOne = service.save(car);
		return new ResponseEntity<Car>(carOne, HttpStatus.OK);
	}
	
	
	@GetMapping("/car/{id}")
	public ResponseEntity<Car> get(@PathVariable("id") int id) {
		Car car = service.findById(id);
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
	
	@DeleteMapping("/car/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id) {
		 service.delete(id);
		return new ResponseEntity<String>("Car is succefully delete !", HttpStatus.OK);
	}
	
	
}
