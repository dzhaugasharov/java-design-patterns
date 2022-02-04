package creatingPatterns.abstractFactory;

/**
 * Concrete product
 */
public class Chicken implements Meat {
    @Override
    public void print() {
        System.out.println("Create Chiken's meat");
    }
}
