package eagerIntialization;

public class AppDesignEagerIntialization {
	public static void main(String[] args) {
		
		DesignEagerIntialization obj1 = DesignEagerIntialization.getInstance();
		
		DesignEagerIntialization obj2 = DesignEagerIntialization.getInstance();
		
		obj1.display();
		obj2.display();

	}
}
