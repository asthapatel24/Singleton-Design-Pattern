package lazyIntialization;

public class AppDesignLazyIntialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesignLazyIntialization obj1 = DesignLazyIntialization.getInstance();

		obj1.display();

		DesignLazyIntialization obj2 = DesignLazyIntialization.getInstance();

		obj2.display();

	}

}
