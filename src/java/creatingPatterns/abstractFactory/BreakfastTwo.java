package creatingPatterns.abstractFactory;

public class BreakfastTwo implements BreakfastFactory{
    @Override
    public Meat createMeat() {
        return new Beef();
    }

    @Override
    public Garnish createGarnish() {
        return new Rice();
    }
}
