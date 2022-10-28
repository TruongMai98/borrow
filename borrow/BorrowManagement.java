package borrow;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BorrowManagement {
    public static final String FILE_PATH = "borrow.csv";
    private List<Borrowing> borrowList;

    public BorrowManagement() {
        borrowList = new ArrayList<>();
    }

    public void add(Borrowing b) {
        borrowList.add(b);
    }

    public void update(String borrowID, Borrowing newBorrow) {
        Borrowing borrow = searchBorrowID(borrowID);
        if (borrow != null) {
            borrow.setStudentID(newBorrow.getStudentID());
            borrow.setBookID(newBorrow.getBookID());
            borrow.setBorrowDate(newBorrow.getBorrowDate());
            borrow.setReturnDate(newBorrow.getReturnDate());
            borrow.setStatus(newBorrow.isStatus());
        }
    }
    public Borrowing searchBorrowID(String borrowID) {
        for (Borrowing b : borrowList) {
            if (b.getBorrowID().equals(borrowID)) {
                return b;
            }
        }
        return null;
    }

    public Borrowing searchByBookID(String id) {
        for (Borrowing b : borrowList) {
            if(b.getBookID().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public Borrowing searchByStudentID(int id) {
        for (Borrowing b : borrowList) {
            if (b.getStudentID().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public  void saveFile() throws IOException{
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Borrowing b : borrowList) {
                bufferedWriter.write(b.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void readFile() throws IOException{
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                Borrowing borrowParseLine = parseLine(line);
                borrowList.add(borrowParseLine);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Borrowing parseLine(String line) {
        String[] strings = line.split(",");
        return new Borrowing(strings[0], strings[1], strings[2], strings[3], strings[4],Boolean.parseBoolean(strings[5]));
    }



}