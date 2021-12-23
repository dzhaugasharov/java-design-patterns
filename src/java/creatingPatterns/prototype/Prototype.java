package creatingPatterns.prototype;

/**
 * Prototype. На схеме имеет аналогичное название.
 *
 * В JDK имеется встроенное решение паттерна. Это встроенный интерфейс Cloneable.
 * Объекты, которые нужно клонировать, должны имплементить интерфейс Cloneable. А в самих классах необходимо переопределить метод clone().
 */
public interface Prototype {
    Object getClone();
}
