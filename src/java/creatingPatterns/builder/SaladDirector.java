package creatingPatterns.builder;

/**
 * SaladDirector - создает объекты на основе абстрактного интерфейса Builder.
 *        На схеме обозначен как Director
 */
public class SaladDirector {
    SaladBuilder builder;
    //  Здесь мы передаем нашему директору конкретного билдера, на основании которого будут создаваться те или иные салаты.
    public void setBuilder(SaladBuilder builder) {
        this.builder = builder;
    }
    //  Здесь мы из частей создаем готовый салат, который в итоге и возвращаем.
    Salad buildSalad(){
        builder.createSalad();
        builder.buildVegetables();
        builder.buildFruits();
        builder.buildMeat();
        builder.buildSauce();

        return builder.getSalad();
    }
}
