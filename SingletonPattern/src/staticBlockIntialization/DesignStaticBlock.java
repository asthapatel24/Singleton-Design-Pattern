package staticBlockIntialization;

public class DesignStaticBlock {
	
	private static DesignStaticBlock instance;

	private DesignStaticBlock() {
	}


	static {
		try {
			instance = new DesignStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	public static DesignStaticBlock getInstance() {
		return instance;
	}

	public void display() {
		System.out.println("Static block intialization Object - "+instance.hashCode());
	}

}
