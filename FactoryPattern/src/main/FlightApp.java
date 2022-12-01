package main;

public class FlightApp {
	public static void main(String[] args) {

		FlightSchedule schedule = new FlightSchedule();

		FlightType flight1 = schedule.getFlight("CommercialFlight");
		flight1.fly();

		FlightType flight2 = schedule.getFlight("PrivateFlight");
		flight2.fly();

	}
}
