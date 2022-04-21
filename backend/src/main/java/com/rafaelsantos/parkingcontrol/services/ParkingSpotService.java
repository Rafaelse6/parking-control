package com.rafaelsantos.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelsantos.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
	
	@Autowired
	private ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotRepository getParkingSpotRepository() {
		return parkingSpotRepository;
	}

	public void setParkingSpotRepository(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
}
