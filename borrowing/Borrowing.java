package borrowing;

import java.util.Date;

public class Borrowing {
    private int borrowId;
    private int studentId;
    private String bookId;
    private Date dateBorrow;
    private Date dateReturn;
    private boolean status;
    private static int count = 0;

    public Borrowing() {
    }

    public Borrowing(int studentId, String bookId, Date dateBorrow) {
        this.studentId = studentId;
        this.bookId = bookId;
        this.dateBorrow = dateBorrow;
        this.borrowId = ++count;
        this.dateReturn = null;
        this.status = false;

    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getBookId() {
        return bookId;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return borrowId +
                "," +
                studentId +
                "," +
                bookId+
                "," +
                dateBorrow +
                "," +
                dateReturn +
                "," +
                status;
    }
}
