package com.bits.ss.dto;

import com.bits.ss.model.Flight;

public class FlightRegistrationResponse {

	private boolean registered;
	private Flight flight;

	public FlightRegistrationResponse(boolean registered, Flight flight) {
		super();
		this.registered = registered;
		this.flight = flight;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
