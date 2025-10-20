package librarySystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void displayAllBooks() {
        System.out.println("\nLibrary Book List:");
        books.forEach(Book::displayInfo);
    }
}
