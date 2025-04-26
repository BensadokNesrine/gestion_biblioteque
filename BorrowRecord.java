
import java.util.Date;

public class BorrowRecord {
    private int userId;
    private int bookId;
    private Date borrowDate;
    private Date returnDate;

    public BorrowRecord(int userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = new Date();
    }

    // Getters et setters
    public int getUserId() { return userId; }
    public int getBookId() { return bookId; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
