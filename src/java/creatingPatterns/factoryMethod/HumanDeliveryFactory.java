package creatingPatterns.factoryMethod;

/**
 * Concrete creator
 */
public class HumanDeliveryFactory implements DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new Human();
    }
}
