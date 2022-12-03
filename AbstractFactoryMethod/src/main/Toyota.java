package main;

public class Toyota extends CarFactory {

	@Override
	public Engine getEngine(String carType) {
		
		if (carType.equalsIgnoreCase("CAMRY")) {
			return new Camry();
		} else if (carType.equalsIgnoreCase("COROLLA")) {
			return new Corolla();
		}
		return null;
	
	}

}
