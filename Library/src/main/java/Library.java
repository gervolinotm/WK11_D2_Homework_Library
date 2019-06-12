import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int stock;

    public Library(){
        this.books = new ArrayList<Book>();
        this.stock = 4;
    }


    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean checkThenAdd(Book book) {
        if (this.stock > this.books.size()){
            this.books.add(book);
            return true;
        } else {
            return false;
        }
    }
}
