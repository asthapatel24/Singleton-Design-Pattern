package serializationSingleton;

import java.io.Serializable;

public class DesignSerialization implements Serializable{
	
	private static final long serialVersionUID = 1511313131113L;

    private DesignSerialization(){}

    private static class SingletonHelper {
        private static final DesignSerialization instance = new DesignSerialization();
    }

    public static DesignSerialization getInstance() {
        return SingletonHelper.instance;
    }
	
    // to avoid creation of new obj while deserialization
    protected Object readResolve() {
        return getInstance();
    }

}
