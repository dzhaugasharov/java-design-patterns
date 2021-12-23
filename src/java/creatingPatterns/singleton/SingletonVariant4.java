package creatingPatterns.singleton;

public class SingletonVariant4 {

    // Без volatile работать не будет
    private static volatile DataBase dataBase;

    //  Приватный конструктор класса
    private SingletonVariant4() {
    }

    //  Синхронизируем не весь метод getInstance(), а только момент инициализации объекта.
    public static DataBase getInstance() {
        if (dataBase == null) {
            // Проверяем, если объект dataBase не существует, тогда синхронизируем наш класс одиночку (DataBase).
            synchronized (DataBase.class) {
                //  снова проверяем, если объект все еще не существует, тогда его создаем
                if (dataBase == null) {
                    dataBase = new DataBase();
                }
            }
        }
        return dataBase;
    }

    public static class DataBase {

    }
}
