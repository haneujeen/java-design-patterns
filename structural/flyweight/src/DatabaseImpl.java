// Concrete flyweight class
// Represents a specific database connection identified by a connection string.
public class DatabaseImpl implements Database {
    private String connectionString;

    public DatabaseImpl(String connectionString) {
        this.connectionString = connectionString;
        System.out.println("Creating a new database connection for: "
                + connectionString);
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing query: "
                + sql + " on database: " + connectionString);
    }
}
