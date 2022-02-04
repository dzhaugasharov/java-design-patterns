package creatingPatterns.abstractFactory;

/**
 * Concrete product B
 */
public class Rice implements Garnish {
    @Override
    public void print() {
        System.out.println("Create garnish with rice");
    }
}
