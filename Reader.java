
public class Reader implements User {
    private int id;
    private String name;

    public Reader(int id, String name) {
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
        System.out.println(name + " (Lecteur) est connecté.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println(name + " (Lecteur) s'est déconnecté.");
    }
}
