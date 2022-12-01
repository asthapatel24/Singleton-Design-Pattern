package main;

public class FlightSchedule {
	
	public FlightType getFlight(String flight) {
		if (flight == null) {
			return null;
		}
		if (flight.equalsIgnoreCase("CARGOFLIGHT")) {
			return new CargoFlight();

		} else if (flight.equalsIgnoreCase("COMMERCIALFLIGHT")) {
			return new CommercialFlight();
		}
		else if(flight.equalsIgnoreCase("PRIVATEFLIGHT")) {
			return new PrivateFlight();
		}

		return null;
	}

}
