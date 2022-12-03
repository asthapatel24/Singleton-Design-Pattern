package main;

public class App {
	public static void main(String[] args) {

		SingleObject object = SingleObject.getInstance();
		object.showMessage();

		SingleObject object2 = SingleObject.getInstance();
		object2.showMessage();
	}

}
