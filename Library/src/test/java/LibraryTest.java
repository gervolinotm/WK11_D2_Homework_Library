import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book1;
    Book book2;
    Book book3;
    Library library;

    @Before
    public void before(){
        book1 = new Book("Lord Of The Rings", "J R R Tolkien", "Fantasy");
        book2 = new Book("Harry Potter", "J K Rowling", "Fantasy");
        book3 = new Book("Frank Grimmes", "David Hall", "Crime");
        library = new Library();
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooksToLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }


    @Test
    public void isThereSpaceToAddBookToCollection(){
       library.addBook(book1);
       library.addBook(book1);
       library.addBook(book1);
       library.addBook(book1);
       assertEquals(4, library.bookCount());
       assertEquals(false, library.checkThenAdd(book2));
    }

}
