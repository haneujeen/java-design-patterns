public class RealServer implements Server {
    public void authenticate(String username, String password) {
        System.out.println("Authentication successful: " + username);
    }

    public void getCredentials() {
        System.out.println("Returning data");
    }
}
