package structurePatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Ящик для хранения простых и составных элементов. На схеме - Composite.
 */
public class Box implements CustomItem {
    // Объявляем список, типизированный интерфейсом CustomItem.
    // Это позволит хранить в листе любые объекты, реализующие интерфейс CustomItem.
    List<CustomItem> items;

    // Создаем конструктор. Во время инициализации объекта Box создаем ArrayList.
    Box() {
        items = new ArrayList();
    }

    public void addItem(CustomItem customItem) {
        items.add(customItem);
    }

    public void removeItem(CustomItem customItem) {// метод удаления элементов из Box.
        items.remove(customItem);
    }

    //  переопределим методы getPrice() и printCost() для составных элементов в ящике
    @Override
    public int getPrice() {
        int cost = 0;
        for (CustomItem item : items) {//перебираем все элементы массива
            cost += item.getPrice();
        }
        return cost;
    }

    @Override
    public void printCost() {
        int cost = 0;
        for (CustomItem item : items) {//перебираем все элементы массива
            cost += item.getPrice();
        }
        System.out.println(cost);
    }
}
