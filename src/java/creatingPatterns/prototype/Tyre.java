package creatingPatterns.prototype;

/**
 * Создаем класс Tyre и реализуем в нем интерфейс Prototype. Объекты этого класса мы будем клонировать.
 * На схеме обозначен ConcretePrototype. Объект этого класса будет выступать в качестве поля класса Car.
 */
public class Tyre implements Prototype {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //  Создаем конструктор
    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    //  Переопределяем toString()
    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    //  Переопределяем метод getClone() интерфейса Prototype.
    @Override
    public Object getClone() {
        //  Создает клон объекта Tyre и возвращает его в виде объекта Object. Нам останется лишь привести возвращенный Object к типу Tyre.
        return new Tyre(name, size);
    }
}
