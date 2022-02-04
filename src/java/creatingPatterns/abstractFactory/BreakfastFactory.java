package creatingPatterns.abstractFactory;

/**
 * Abstract Factory
 */
public interface BreakfastFactory {
    Meat createMeat();
    Garnish createGarnish();
}
