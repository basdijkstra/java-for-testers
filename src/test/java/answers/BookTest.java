package answers;

import org.junit.Test;

public class BookTest {

    @Test
    public void testAnArrayOfBooks() {

        Book myBook = new Book();
        myBook.anArrayOfBooks();
    }

    @Test
    public void testAListOfBooks() {

        Book myBook = new Book();
        myBook.aListOfBooks();
    }
}
