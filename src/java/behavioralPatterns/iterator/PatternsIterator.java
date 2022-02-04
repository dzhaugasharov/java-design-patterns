package behavioralPatterns.iterator;

public class PatternsIterator implements Iterator {
    private final String[] patterns;// Ссылка на массив паттернов
    int index = 0;// Переменная index соответствует индексу элемента в массиве.

    PatternsIterator(String[] patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean hasNext() {
        // иначе возвращает false, т.е. коллекция закончилась
        return index < patterns.length;// если index меньше длины массива - возвращает true
    }

    @Override
    public Object next() {
        return patterns[index++];// возвращаем следующий элемент коллекции, после чего инкрементируем index
    }
}
