package com.flightattend.flight_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.flightattend.flight_service.repository.FlightRepository;
import com.flightattend.flight_service.Flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

    public List<Flight> searchFlights(String departure, String destination, LocalDateTime startTime, LocalDateTime endTime) {
        return flightRepository.findByDepartureAndDestinationAndDepartureTimeBetween(departure, destination, startTime, endTime);
    }
}
