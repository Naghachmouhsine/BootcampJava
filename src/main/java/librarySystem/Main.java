package librarySystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book f1 = new FictionBook("Book 1", "Author1", "12345", "genre1");
        Book n1 = new NonFictionBook("Book2", "Author2", "67890", "Subject");
        Book n2 = new NonFictionBook("Book3", "Author3", "7890", "Subject");
        Book n3 = new FictionBook("Book4", "Author4", "7890", "Genre");

        library.addBook(f1);
        library.addBook(n1);
        library.addBook(n2);
        library.addBook(n3);

        library.displayAllBooks();
    }
}
