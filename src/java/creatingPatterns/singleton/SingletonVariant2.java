package creatingPatterns.singleton;

/**
 * Lazy creating of instance
 */
public class SingletonVariant2 {

    // static instance field
    private static SingletonVariant2 instance;

    // add private constructor
    private SingletonVariant2() {
    }

    public static SingletonVariant2 getInstance() {
        // creates only when requested. Lazy mode
        if (instance == null) instance = new SingletonVariant2();
        return instance;
    }
}
