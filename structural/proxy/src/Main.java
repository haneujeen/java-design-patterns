/**
 * The Proxy design pattern provides a placeholder for an object to control access.
 * A proxy can add behaviors like access control, caching, lazy initialization, and others,
 * to an object without changing its code.
 */
public class Main {
    public static void main(String[] args) {
        RealServer server = new RealServer();
        ServerProxy proxy = new ServerProxy(server);

        // Request without authentication
        proxy.getCredentials();

        // Authenticating
        proxy.authenticate("admin", "password");

        // User authenticated
        proxy.getCredentials();
    }
}
