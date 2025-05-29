package designPatterns.singleton;

public class LazySingleton {

    //not initialized yet
    private static LazySingleton instance;

    //private constructor to prevent instantiation
    private LazySingleton()
    {
        System.out.println("Instance created");
    }

    public static LazySingleton getInstance()
    {
        if(instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        LazySingleton lz = LazySingleton.getInstance(); // Instance created
        LazySingleton ly = LazySingleton.getInstance(); // No Instance created

        System.out.println(lz == ly); // true
    }

}
