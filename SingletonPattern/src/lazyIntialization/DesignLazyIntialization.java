package lazyIntialization;

public class DesignLazyIntialization {

	private static DesignLazyIntialization instance;

	private DesignLazyIntialization(){}

	public static DesignLazyIntialization getInstance() {
		
		if (instance == null) {
			
			instance = new DesignLazyIntialization();
		}
		return instance;
	}
	
	public void display() {
		System.out.println("Lazy Intialization Object hashCode - "+instance.hashCode());
	}
}
