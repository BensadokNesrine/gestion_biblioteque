
public interface User {
    int getId();
    String getName();
    boolean login(String username, String password);
    void logout();
}

