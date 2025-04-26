
import java.util.ArrayList;
import java.util.List;

public class ArrayListStorageAdapter implements Storage {
    private List<Book> books = new ArrayList<>();

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> loadBooks() {
        return books;
    }
}

