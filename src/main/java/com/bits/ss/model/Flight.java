package com.bits.ss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_flights")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long flightId;
	@Column(name = "company")
	private String company;
	@Column(name = "flight_number")
	private String flightNumber;
	@Column(name = "source_city")
	private String source;
	@Column(name = "destination_city")
	private String destination;
	@Column(name = "nonStop")
	private boolean nonStop;
	@Column(name = "intermediate_stops")
	private String[] intermediateStops;

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean isNonStop() {
		return nonStop;
	}

	public void setNonStop(boolean nonStop) {
		this.nonStop = nonStop;
	}

	public String[] getIntermediateStops() {
		return intermediateStops;
	}

	public void setIntermediateStops(String[] intermediateStops) {
		this.intermediateStops = intermediateStops;
	}

}
