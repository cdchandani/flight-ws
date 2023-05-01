package com.bits.ss.dto;

import java.util.List;

import com.bits.ss.model.Flight;

public class FlightSearchResponse {

	private int count;
	private List<Flight> flights;

	public FlightSearchResponse(List<Flight> flights, int count) {
		this.flights = flights;
		this.count = count;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
