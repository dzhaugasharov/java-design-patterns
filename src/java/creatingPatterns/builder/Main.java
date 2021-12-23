package creatingPatterns.builder;

public class Main {
    public static void main(String[] args) {
        SaladDirector saladDirector = new SaladDirector(); // Создаем объект директора

        saladDirector.setBuilder(new SunSaladBuilder());// Передаем директору конкретного строителя.
        Salad salad = saladDirector.buildSalad();// Получаем готовый салат.
        System.out.println(salad);// Выводим toString() готового салата "Солнышко"

        System.out.println("==================================");

        saladDirector.setBuilder(new CesarSaladBuilder());// Передаем директору строителя салата "Цезарь".
        salad = saladDirector.buildSalad();// Получаем другой салат.
        System.out.println(salad);// Выводим toString() готового салата "Цезарь"
    }
}
