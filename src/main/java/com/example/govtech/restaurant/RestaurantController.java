package com.example.govtech.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/restaurant")
@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping(path = "/add", consumes = "application/json")
	public ResponseEntity<String> addRestaurant(@RequestBody RestaurantDto restaurantDto) {
		restaurantService.addRestaurant(restaurantDto.getName());
		return new ResponseEntity<String>("Restaurant added", HttpStatus.OK);
	}
	
	@GetMapping(path = "/getRandomRestaurant")
	public ResponseEntity<String> getRandomRestaurant() {
		String restaurant = restaurantService.getRandomRestaurant();
		return new ResponseEntity<String>(restaurant, HttpStatus.OK);
	}

}
