package creatingPatterns.factoryMethod;

/**
 * Concrete creator
 */
public class BikeDeliveryFactory implements DeliveryFactory {
    public Delivery createDelivery() {
        return new Bike();
    }
}
