package creatingPatterns.abstractFactory;

public class BreakfastOne implements BreakfastFactory {
    @Override
    public Meat createMeat() {
        return new Chicken();
    }

    @Override
    public Garnish createGarnish() {
        return new Buckwheat();
    }
}
