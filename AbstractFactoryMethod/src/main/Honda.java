package main;

public class Honda extends CarFactory {

	@Override
	public Engine getEngine(String carType) {

		if (carType.equalsIgnoreCase("ACCORD")) {
			return new Accord();
		}
		else if (carType.equalsIgnoreCase("CIVIC")) {
			return new Civic();
		}
		return null;

	}

}
