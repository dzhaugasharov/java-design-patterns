package creatingPatterns.builder;

public abstract class SaladBuilder {

    Salad salad;

    //  Этот метод создает новый объект Salad с пустыми полями.
    void createSalad(){
        salad = new Salad();
    }
    /*
        Для каждого поля создаваемого класса добавляем метод, который создает это поле.
    */
    abstract void buildVegetables();
    abstract void buildFruits();
    abstract void buildMeat();
    abstract void buildSauce();

    //Этот метод возвращает готовый объект Salad с заполненными полями.
    Salad getSalad(){
        return salad;
    }
}
