
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem implements Subject{
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<BorrowRecord> borrowRecords = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private Storage storage;

    public LibrarySystem(Storage storage) {
        this.storage = storage;
    }

    public void addBook(Book book) {
        books.add(book);
        storage.saveBook(book);
        notifyObservers("Nouveau livre ajouté: " + book.getTitle());
    }

    public void removeBook(int bookId) {
    	for (int i = 0; i < books.size(); i++) {
    	    if (books.get(i).getId() == bookId) {
    	        books.remove(i);
    	        break;
    	    }
    	}

        notifyObservers("Livre supprimé (ID): " + bookId);
    }

    public void borrowBook(int userId, int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isAvailable()) {
                book.setAvailable(false);
                borrowRecords.add(new BorrowRecord(userId, bookId));
                notifyObservers("Livre emprunté: " + book.getTitle());
                return;
            }
        }
        System.out.println("Livre non disponible.");
    }

    public void returnBook(int userId, int bookId) {
        for (BorrowRecord record : borrowRecords) {
            if (record.getBookId() == bookId && record.getUserId() == userId && record.getReturnDate() == null) {
                record.setReturnDate(new java.util.Date());
                for (Book book : books) {
                    if (book.getId() == bookId) {
                        book.setAvailable(true);
                        notifyObservers("Livre retourné: " + book.getTitle());
                        return;
                    }
                }
            }
        }
        System.out.println("Erreur lors du retour.");
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    private void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}

