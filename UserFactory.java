
public class UserFactory {
    public static User createUser(String type, int id, String name) {
        if (type.equalsIgnoreCase("Admin")) {
            return new Admin(id, name);
        } else if (type.equalsIgnoreCase("Reader")) {
            return new Reader(id, name);
        } else {
            return null;
        }
    }
}

