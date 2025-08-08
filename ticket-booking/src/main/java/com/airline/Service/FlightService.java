package com.airline.Service;

import java.util.*;

public class FlightService {
    private Map<String, Integer> flightCapacity = new HashMap<>();

    public FlightService() {
        flightCapacity.put("FL123", 2); // 2 seats available
    }

    public Map<String, Integer> getFlightCapacity() {
        return flightCapacity;
    }

    public void setFlightCapacity(Map<String, Integer> flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    public boolean hasAvailableSeats(String flightId) {
        return flightCapacity.getOrDefault(flightId, 0) > 0;
    }

    public void reserveSeat(String flightId) {
        flightCapacity.put(flightId, flightCapacity.get(flightId) - 1);
    }
}