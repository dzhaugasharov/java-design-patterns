package creatingPatterns.builder;

public class SunSaladBuilder extends SaladBuilder {
    @Override
    void buildVegetables() {
        salad.setVegetables("Cucumber");
    }

    @Override
    void buildFruits() {
        salad.setFruits("Orange");
    }

    @Override
    void buildMeat() {
        salad.setMeat("Beef");
    }

    @Override
    void buildSauce() {
        salad.setSauce(Sauce.CHEESE);
    }
}
