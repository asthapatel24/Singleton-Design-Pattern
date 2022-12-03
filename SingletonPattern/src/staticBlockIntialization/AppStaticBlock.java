package staticBlockIntialization;

public class AppStaticBlock {

	public static void main(String[] args) {
		
			DesignStaticBlock obj1 = DesignStaticBlock.getInstance();
			obj1.display();
			
			DesignStaticBlock obj2 = DesignStaticBlock.getInstance();
			obj2.display();
			
			
	}
}
