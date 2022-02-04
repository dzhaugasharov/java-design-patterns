package creatingPatterns.abstractFactory;

/**
 * Concrete product
 */
public class Beef implements Meat {
    @Override
    public void print() {
        System.out.println("Create pork");
    }
}
