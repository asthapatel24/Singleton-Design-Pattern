package main;

public class AppCar {
	
	public static void main(String[] args) {

		CarFactory car1 = CarManufacturer.getCar("Honda");

		Engine carEngine1 = car1.getEngine("Civic");
		carEngine1.CreateEngine();

		CarFactory car2 = CarManufacturer.getCar("Toyota");

		Engine carEngine2 = car2.getEngine("Camry");
		carEngine2.CreateEngine();

	}
}
