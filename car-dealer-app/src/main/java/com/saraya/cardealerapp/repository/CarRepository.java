package com.saraya.cardealerapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.cardealerapp.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	

}
