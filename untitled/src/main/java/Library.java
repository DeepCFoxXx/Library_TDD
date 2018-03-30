import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (!isFull()){
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public boolean isFull(){
        return books.size() < this.capacity;
    }

    public void buyFromPublisher(Publisher publisher) {
        if (!isFull()){
            Book book = publisher.getBook();
            addBook(book);
        }
    }
}
