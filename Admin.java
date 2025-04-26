

public class Admin implements User {
    private int id;
    private String name;

    public Admin(int id, String name) {
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
        System.out.println(name + " (Admin) est connect�.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println(name + " (Admin) s'est d�connect�.");
    }
}
