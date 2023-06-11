public interface Server {
    void authenticate(String username, String password);
    void getCredentials();
}