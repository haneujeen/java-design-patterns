public class ServerProxy implements Server {
    private RealServer server;
    private boolean isAuthenticated = false;

    public ServerProxy(RealServer server) {
        this.server = server;
    }

    public void authenticate(String username, String password) {
        if (username.equals("admin") && password.equals("password")) {
            isAuthenticated = true;
            server.authenticate(username, password);
        } else {
            System.out.println("Authentication failed");
        }
    }

    public void getCredentials() {
        if (isAuthenticated) {
            server.getCredentials();
        } else {
            System.out.println("User not authenticated");
        }
    }
}