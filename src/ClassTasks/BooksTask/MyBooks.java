package ClassTasks.BooksTask;

import java.util.ArrayList;
import java.util.List;

public class MyBooks {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("Iron Flame");
        book1.setPrice(12.99);
        book1.setPageNumbers(600);

        Book book2 = new Book();
        book2.setName("All the Light we Cannot See");
        book2.setPrice(10.90);
        book2.setPageNumbers(189);

        Book book3 = new Book();
        book3.setName("Crescent City");
        book3.setPrice(20.49);
        book3.setPageNumbers(750);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        printBookInformation(bookList);
    }

    public static void printBookInformation(List<Book> books) {
        System.out.println("Books Information-");
        for (Book book : books) {
            System.out.println("Title: " + book.getName());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Page Numbers: " + book.getPageNumbers());
        }
    }
}