package creatingPatterns.singleton;

public class SingletonVariant1 {

    // static instance field
    private static SingletonVariant1 instance = new SingletonVariant1();

    // add private constructor
    private SingletonVariant1() {
    }

    public static SingletonVariant1 getInstance() {
        return instance;
    }
}
