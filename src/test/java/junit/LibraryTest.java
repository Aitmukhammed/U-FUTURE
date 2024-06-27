package junit;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Shop.Book;
import org.example.Shop.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Title1", "Author1", 2000, "ISBN1"));
        library.addBook(new Book("Title2", "Author2", 2001, "ISBN2"));
        library.addBook(new Book("Title3", "Author1", 2002, "ISBN3"));
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Title4", "Author3", 2003, "ISBN4");
        library.addBook(book);
        assertEquals(4, library.getAllBooks().size());
    }

    @Test
    public void testRemoveBook() {
        assertTrue(library.removeBook("ISBN1"));
        assertEquals(2, library.getAllBooks().size());
        assertFalse(library.removeBook("ISBN4"));
    }

    @Test
    public void testSearchByTitle() {
        List<Book> books = library.searchByTitle("Title1");
        assertEquals(1, books.size());
        assertEquals("Author1", books.get(0).getAuthor());
    }

    @Test
    public void testSearchByAuthor() {
        List<Book> books = library.searchByAuthor("Author1");
        assertEquals(2, books.size());
    }

    @Test
    public void testSearchByYear() {
        List<Book> books = library.searchByYear(2001);
        assertEquals(1, books.size());
        assertEquals("Title2", books.get(0).getTitle());
    }

    @Test
    public void testSearchByIsbn() {
        Optional<Book> book = library.searchByIsbn("ISBN2");
        assertTrue(book.isPresent());
        assertEquals("Title2", book.get().getTitle());
    }
}

