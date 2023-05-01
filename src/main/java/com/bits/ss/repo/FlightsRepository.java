package com.bits.ss.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.ss.model.Flight;

@Repository
public interface FlightsRepository extends JpaRepository<Flight, Long>{
	
	List<Flight> getFlightsBySourceAndDestination(String source, String destination);

}
