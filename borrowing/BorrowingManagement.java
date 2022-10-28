package borrowing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowingManagement {
    List<Borrowing> borrowings;


    public BorrowingManagement() {
        borrowings = new ArrayList<>();
        Borrowing br1 = new Borrowing(1,"1235",new Date("10/25/2022"));
        Borrowing br2 = new Borrowing(2,"1234",new Date("10/15/2022"));
        Borrowing br3 = new Borrowing(3,"1236",new Date("10/20/2022"));
        Borrowing br4 = new Borrowing(3,"1235",new Date("10/22/2022"));
        Borrowing br5 = new Borrowing(2,"1235",new Date("10/21/2022"));

        borrowings.add(br1);
        borrowings.add(br2);
        borrowings.add(br3);
        borrowings.add(br4);
        borrowings.add(br5);
    }

    public int add(Borrowing b) {
        borrowings.add(b);
        return b.getBorrowId();
    }

    public void returnBook(int borrowId) {
        Borrowing borrowing = searchByBorrowingId(borrowId);
        if (borrowing != null) {
            borrowing.setDateReturn(new Date());
            borrowing.setStatus(true);
        }
    }

    public Borrowing searchByBorrowingId(int borrowId) {
        for (Borrowing b : borrowings) {
            if (b.getBorrowId() == borrowId) {
                return b;
            }
        }
        return null;
    }
    public List<Borrowing> getOnBorrowings(){
        List<Borrowing> onBorrowings = new ArrayList<>();
        for (Borrowing br : borrowings){
            if(!br.isStatus()){
                onBorrowings.add(br);
            }
        }
        return onBorrowings;
    }



}

