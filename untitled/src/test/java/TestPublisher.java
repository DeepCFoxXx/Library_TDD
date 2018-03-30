import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPublisher {

    private Book book;
    private Publisher publisher;

    @Before
    public void before() {
        book = new Book();
        publisher = new Publisher("Coffee Table INC");
    }

    @Test
    public void publisherStartsEmpty(){
        assertEquals(0, publisher.getStockCount());
    }

}
