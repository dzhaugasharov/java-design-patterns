package creatingPatterns.factoryMethod;

public class Main {

    public static void main(String[] args) {
        DeliveryFactory deliveryFactory = supplyDelivery(2);
        Delivery delivery = deliveryFactory.createDelivery();
        delivery.supply();
    }

    // Подставляя в переменную "а" различные числа, получим различные типы доставки
    static DeliveryFactory supplyDelivery(int a){
        switch (a){
            case 1 : return new BikeDeliveryFactory();
            case 2 : return new HumanDeliveryFactory();
            default: throw new RuntimeException("Such a factory does not exist ");
        }
    }
}
