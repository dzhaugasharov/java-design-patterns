package structurePatterns.composite;

/**
 * общий интерфейс (свойства) для всех предметов в коробках,
 * в нашем случае свойство - цена одного элемента
 * на диаграмме обозначен как Component
 */
public interface CustomItem {
    int getPrice();//   получить цену (стоимость) одного элемента
    void printCost();// вывести на экран стоимость
}
