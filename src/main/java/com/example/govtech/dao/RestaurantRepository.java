package com.example.govtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	
	@Query(value="Select * from restaurant order by rand() limit 1", nativeQuery=true)
	Restaurant getRandomRestaurant();

}
