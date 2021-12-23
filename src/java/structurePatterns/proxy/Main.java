package structurePatterns.proxy;

public class Main {

    public static void main(String[] args) {
        DatabaseWorker databaseWorker = new DatabaseWorker();
        DatabaseCache databaseCache = new DatabaseCache(databaseWorker);
        DatabaseManager databaseManager = new DatabaseManager(databaseCache);

        databaseManager.makeConnection("127.0.0.1");
        databaseManager.runQuery("Select * from *");
    }
}
