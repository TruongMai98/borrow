package borrow;

import java.util.Scanner;

public class BorrowManagementMenu {
    BorrowManagement borrowManagement = new BorrowManagement();

    public void displayMenu() {
        System.out.println("============Menu============");
        System.out.println("*     Borrow Management*    ");
        System.out.println("* 1. Add borrow            *");
        System.out.println("* 2. Remove borrow         *");
        System.out.println("* 3. Search by borrow id   *");
        System.out.println("* 4. Search by book id     *");
        System.out.println("* 5. Search by student id  *");
        System.out.println("* 6. Read  file            *");
        System.out.println("* 7. Save file             *");
        System.out.println("* 8. Display all           *");
        System.out.println("* 9. Update                *");
        System.out.println("* 0. Done                  *");
        System.out.println("============================");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        while (choose != 0) {
            displayMenu();
            System.out.println("Enter number");
            choose = scanner.nextInt();
            switch (choose) {

            }

        }
    }

}
