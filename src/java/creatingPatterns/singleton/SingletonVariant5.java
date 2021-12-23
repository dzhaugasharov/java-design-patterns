package creatingPatterns.singleton;

public class SingletonVariant5 {

    public static class DataBase {
        private int count = 0;
        //  Приватный конструктор класса
        private DataBase() {
            count++;
            System.out.println(count);
        }
        //  Создадим внутренний класс DataBaseHolder с приватным статическим полем, которое содержит в себе новый объект одиночку.
        private static class DataBaseHolder{
            private final static DataBase databaseHolder = new DataBase();
        }

        public static DataBase getInstance(){
            return DataBaseHolder.databaseHolder;
        }
    }

    static class DBMain{
        public static void main(String[] args) {
            DataBase.getInstance();
            DataBase.getInstance();
        }
    }
}
