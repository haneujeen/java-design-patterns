/**
 * This module demonstrates the Flyweight design pattern and mimics a simplified
 * database connection system.
 *
 * - In Main, `db1` and `db2` request database object with the same connection string.
 *   `DatabaseWarehouse` checks if it has the requested database object in its `databaseMap`,
 *   and returns the existing one if found.
 *
 * - `db3` requests a database with a different connection string.
 *   so the `DatabaseWarehouse` creates and adds a new `DatabaseImpl` object to its map.
 *
 * - `DatabaseImpl` represents a specific database connection identified by a connection string.
 *
 * - `DatabaseWarehouse` works as a factory for creating instances of Database object with
 *   the `getDatabase(String connectionString)` method.
 *   It returns the existing Database object or creates a new one.
 */
public class Main {
    public static void main(String[] args) {
        Database db1 = DatabaseWarehouse
                .getDatabase("mysql://localhost:3306/mydb");
        db1.query("SELECT * FROM users");

        Database db2 = DatabaseWarehouse
                .getDatabase("mysql://localhost:3306/mydb");
        db2.query("UPDATE products SET price = 10.99 WHERE id = 1");

        Database db3 = DatabaseWarehouse
                .getDatabase("postgres://localhost:5432/mydb");
        db3.query("DELETE FROM orders WHERE status = 'cancelled'");

        System.out.println("db1 == db2: " + (db1 == db2));
    }
}