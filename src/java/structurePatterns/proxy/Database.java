package structurePatterns.proxy;

public interface Database {
    String connect(String ConnectionString);
    String query(String SQL);
}
