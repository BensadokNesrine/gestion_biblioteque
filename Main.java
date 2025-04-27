public class Main {
    public static void main(String[] args) {
        Storage storage = new ArrayListStorageAdapter();
        LibrarySystem library = new LibrarySystem(storage);

        // Example actions
        User admin = UserFactory.createUser("Admin", 1, "Admin1");
        library.addObserver(new AdminObserver());
        
        Book book = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(book);
    }
}
