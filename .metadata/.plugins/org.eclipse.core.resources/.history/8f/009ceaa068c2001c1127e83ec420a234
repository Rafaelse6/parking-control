package com.rafaelsantos.parkingcontrol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelsantos.parkingcontrol.services.ParkingSpotService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {
	
		
	@Autowired
	private ParkingSpotService parkingSpotService;

	public ParkingSpotService getParkingSpotService() {
		return parkingSpotService;
	}

	public void setParkingSpotService(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}
	
}
