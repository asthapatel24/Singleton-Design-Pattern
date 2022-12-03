package enumSingleton;

public class AppEnumSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumClass enum1 = EnumClass.INSTANCE;
		EnumClass enum2 = EnumClass.INSTANCE;

		System.out.println("HashCodeo of obj1 - "+enum1.hashCode());
		System.out.println("HashCodeo of obj2 - "+enum2.hashCode());

	}

}
