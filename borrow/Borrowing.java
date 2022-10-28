package borrow;

public class Borrowing {
    private String borrowID;
    private String studentID;
    private String bookID;
    private String borrowDate;
    private String returnDate;
    private boolean status;

    public Borrowing() {
    }

    public Borrowing(String borrowID, String studentID, String bookID, String borrowDate, String returnDate, boolean status) {
        this.borrowID = borrowID;
        this.studentID = studentID;
        this.bookID = bookID;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }


    public String getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(String borrowID) {
        this.borrowID = borrowID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String  getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return borrowID +
                "," +
                studentID +
                "," +
                bookID +
                "," +
                borrowDate +
                "," +
                returnDate +
                "," +
                status;
    }
}
