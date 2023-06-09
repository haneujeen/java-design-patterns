/**
 * This example includes Factory design pattern. Codes are written by ChatGPT from OpenAI.
 *
 * A superclass (factory) is an interface creating objects. Subclasses (database) decide which class to instantiate.
 * A common superclass returns one of several possible types based on the input or something else.
 */
interface Connection {
    void connect();
}

class Oracle implements Connection {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle.");
    }
}

class MySQL implements Connection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL.");
    }
}

class PostgreSQL implements Connection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL.");
    }
}

class Factory {
    static Connection getConnection(String type) {
        if (type.equalsIgnoreCase("Oracle")) {
            return new Oracle();
        } else if (type.equalsIgnoreCase("MySQL")) {
            return new MySQL();
        } else if (type.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSQL();
        } else {
            throw new IllegalArgumentException("Invalid database type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Connection oracle = Factory.getConnection("Oracle");
        oracle.connect();

        Connection mysql = Factory.getConnection("MySQL");
        mysql.connect();

        Connection postgresql = Factory.getConnection("PostgreSQL");
        postgresql.connect();
    }
}