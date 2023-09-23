package com.example.govtech.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.govtech.dao.Restaurant;
import com.example.govtech.dao.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public void addRestaurant(String name) {
		Restaurant r = new Restaurant();
		r.setName(name);
		restaurantRepository.save(r);
	}

	@Override
	public String getRandomRestaurant() {
		Restaurant r = restaurantRepository.getRandomRestaurant();
		return r != null ? r.getName() : null;
	}

}
