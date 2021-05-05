import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;

    @Before
    public void SetUp() {
        library = new Library(2);
        book = new Book("It", "Steven King", "Horror");
        book1 = new Book("It", "Steven King", "Horror");
        book2 = new Book("It", "Steven King", "Horror");
    }

    @Test
    public void bookCountStartsAt0() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooks() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBooks() {
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }
}

