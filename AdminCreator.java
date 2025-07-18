

public class AdminCreator implements User {
    private int id;
    private String name;

    public AdminCreator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean login(String username, String password) {
        // Simplification: mot de passe toujours correct
        System.out.println(name + " (Admin) est connecté.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println(name + " (Admin) s'est déconnecté.");
    }
}
