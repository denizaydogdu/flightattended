package com.flightattend.flight_service.repository;

//import com.flightattend.flight_service.model.Flight;
import com.flightattend.flight_service.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByDepartureAndDestinationAndDepartureTimeBetween(
            String departure, String destination, LocalDateTime startTime, LocalDateTime endTime
    );

}
