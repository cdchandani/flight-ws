package com.bits.ss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.ss.dto.FlightRegistrationResponse;
import com.bits.ss.dto.FlightRequest;
import com.bits.ss.dto.FlightSearchResponse;
import com.bits.ss.model.Flight;
import com.bits.ss.services.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService service;

	@PostMapping("/flights/search")
	public FlightSearchResponse searchFlights(@RequestBody FlightRequest request) {
		return service.getFlights(request);
	}
	
	@PostMapping("/flights/register")
	public FlightRegistrationResponse registerFlight(@RequestBody Flight request) {
		return service.registerFlight(request);
	}
	
	@GetMapping("/flights/{id}")
	public Flight getFlightById(@PathVariable("id") long id) {
		return service.getFlightById(id);
	}
}
