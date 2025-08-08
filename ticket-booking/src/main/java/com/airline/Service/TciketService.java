package com.airline.Service;

public class TciketService {
    private FlightService flightService;

    public FlightService getFlightService() {
        return flightService;
    }

    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }

    public String confirmBooking(String flightId, String userId) {
        if (flightService.hasAvailableSeats(flightId)) {
            flightService.reserveSeat(flightId);
            return "Booking confirmed for " + userId + " on " + flightId;
        } else {
            return "Flight " + flightId + " is full";
        }
    }
}