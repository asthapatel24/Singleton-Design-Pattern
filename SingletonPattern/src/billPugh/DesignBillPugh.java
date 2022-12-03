package billPugh;

public class DesignBillPugh {

	private DesignBillPugh() {
	}

	private static class SingletonHelper {
		private static final DesignBillPugh INSTANCE = new DesignBillPugh();
	}

	public static DesignBillPugh getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public void display() {
		System.out.println("bill pugh design object - "+ SingletonHelper.INSTANCE.hashCode());
	}

}
