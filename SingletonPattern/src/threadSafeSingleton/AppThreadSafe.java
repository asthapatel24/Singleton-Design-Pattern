package threadSafeSingleton;

public class AppThreadSafe {

	public static void main(String[] args) {
		
		DesignTheradSafe obj1 = DesignTheradSafe.getInstance();
		obj1.display();
		
		DesignTheradSafe obj2 = DesignTheradSafe.getInstance();
		obj2.display();
	}

}
