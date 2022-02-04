package creatingPatterns.factoryMethod;


/**
 * Concrete product
 */
public class Human implements Delivery {
    @Override
    public void supply() {
        System.out.println("Human supply");
    }
}
