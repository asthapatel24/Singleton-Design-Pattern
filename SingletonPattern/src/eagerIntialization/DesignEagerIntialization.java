package eagerIntialization;

public class DesignEagerIntialization {

	private static  DesignEagerIntialization instance = new DesignEagerIntialization();

	private DesignEagerIntialization() {
	}

	public static DesignEagerIntialization getInstance() {
		return instance;
	}

	public void display() {
		System.out.println("Design Eager Intialization Object hashCode -  "+instance.hashCode());
	}
}
