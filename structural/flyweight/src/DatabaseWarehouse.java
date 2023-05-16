import java.util.HashMap;
import java.util.Map;

// Flyweight factory class
/*
 * Works as a factory for creating instances of Database object with the
 * `getDatabase(String connectionString)` method.
 *
 * Returns the existing Database object or creates a new one.
 */
public class DatabaseWarehouse {
    private static final Map<String, Database> databaseMap = new HashMap<>();

    public static Database getDatabase(String connectionString) {
        Database database = databaseMap.get(connectionString);

        if (database == null) {
            database = new DatabaseImpl(connectionString);

            databaseMap.put(connectionString, database);
        }
        return database;
    }
}
