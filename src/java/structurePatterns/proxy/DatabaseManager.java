package structurePatterns.proxy;

public class DatabaseManager {
    DatabaseWorker databaseWorker;

    DatabaseManager(DatabaseWorker databaseWorker) {
        this.databaseWorker = databaseWorker;
    }

    void makeConnection(String connectionString) {
        databaseWorker.connect(connectionString);
    }

    String runQuery(String SQL) {
        return databaseWorker.query(SQL);
    }
}
