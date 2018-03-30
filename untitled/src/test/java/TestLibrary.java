import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Book book;
    private Library library;
    private Publisher publisher;

    @Before
    public void before(){
        library = new Library("New Age", 5);
        book = new Book();
        publisher = new Publisher("Coffee Table INC");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
        library.removeBook(book);
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void cantGoOverCapacity(){
        for (int i = 0; i < 7; i++){
            library.addBook(book);
        }
        assertEquals(5, library.getBookCount());
    }

    @Test
    public void canBuyFromPublisher(){
        publisher.addBookToStock(book);
        library.buyFromPublisher(publisher);
        assertEquals(0, publisher.getStockCount());
        assertEquals(1, library.getBookCount());
    }

}
