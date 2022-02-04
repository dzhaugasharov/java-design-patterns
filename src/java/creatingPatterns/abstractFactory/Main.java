package creatingPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        //  Попробуйте заменить new BreakfastOne() на new BreakfastTwo()
        //  и увидите, мы получим завтрак из говядины и риса.
        BreakfastFactory breakfastFactory = new BreakfastOne();
        Meat meat = breakfastFactory.createMeat();
        Garnish garnish = breakfastFactory.createGarnish();

        System.out.println("Creating breakfast");
        meat.print();
        garnish.print();
    }
}
