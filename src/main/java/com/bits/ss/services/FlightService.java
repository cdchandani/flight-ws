package com.bits.ss.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.ss.dto.FlightRegistrationResponse;
import com.bits.ss.dto.FlightRequest;
import com.bits.ss.dto.FlightSearchResponse;
import com.bits.ss.model.Flight;
import com.bits.ss.repo.FlightsRepository;

@Service
public class FlightService {

	@Autowired
	private FlightsRepository repo;

	public FlightSearchResponse getFlights(FlightRequest request) {

		List<Flight> flights = repo.getFlightsBySourceAndDestination(request.getFrom(), request.getTo());
		return new FlightSearchResponse(flights, flights.size());
	}

	public FlightRegistrationResponse registerFlight(Flight request) {
		Flight flight = repo.save(request);
		return (flight != null) ? new FlightRegistrationResponse(true, flight)
				: new FlightRegistrationResponse(false, null);

	}

	public Flight getFlightById(long id) {
		return repo.findById(id).get();
	}

}
