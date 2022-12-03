package threadSafeSingleton;

public class DesignTheradSafe {

	private static DesignTheradSafe instance;

	private DesignTheradSafe() {
	}

	public static synchronized DesignTheradSafe getInstance() {
		if (instance == null) {
			instance = new DesignTheradSafe();
		}
		return instance;
	}

	// to double check lock implementation by synch block
	public static DesignTheradSafe getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (DesignTheradSafe.class) {
				if (instance == null) {
					instance = new DesignTheradSafe();
				}
			}
		}
		return instance;
	}

	public void display() {
		System.out.println("thread safe singleton obj - "+instance.hashCode());
	}

}
