import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void SetUp() {
        library = new Library();
        book = new Book("It", "Steven King", "Horror");
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
}

