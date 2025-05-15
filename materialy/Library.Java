// Library.java
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }
    public void removeBook(Book book) { books.remove(book); }
    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }
    public List<Book> getBooks() { return books; }
}