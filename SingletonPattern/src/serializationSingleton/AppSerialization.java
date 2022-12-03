package serializationSingleton;

import java.io.*;

public class AppSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DesignSerialization instanceOne = DesignSerialization.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("demo.txt"));
		out.writeObject(instanceOne);
		out.close();

		// deserialize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("demo.txt"));
		DesignSerialization instanceTwo = (DesignSerialization) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

	}
}
