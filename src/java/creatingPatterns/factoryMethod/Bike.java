package creatingPatterns.factoryMethod;

/**
 * Concrete product
 */
public class Bike implements Delivery {
    @Override
    public void supply() {
        System.out.println("Bike supply");
    }
}
