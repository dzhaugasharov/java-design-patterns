package creatingPatterns.abstractFactory;

/**
 * Concrete product B
 */
public class Buckwheat implements Garnish {
    @Override
    public void print() {
        System.out.println("Create garnish with buckwheat");
    }
}
