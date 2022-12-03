package main;

public class CarManufacturer {

	public static CarFactory getCar(String company) {
		
		if (company.equalsIgnoreCase("Toyota")) {
			
			return new Toyota();
		} 
		else {
			return new Honda();
		}
	}

}
