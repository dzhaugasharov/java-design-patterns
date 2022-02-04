package behavioralPatterns.iterator;

public interface Iterator {
    boolean hasNext();// вернет true, если в массиве есть не пройденные элементы
    Object next();// возвращает следующий элемент
}
