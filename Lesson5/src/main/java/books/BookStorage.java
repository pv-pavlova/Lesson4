package books;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import books.Book;

@Component
public class BookStorage {
    private static int count;
    ArrayList<Book> ListB;
    {
        ListB = new ArrayList<>();
    }
    public List<Book> index(){
        return ListB;
    }
    public void add(Book book){
        book.setId(++count);
        ListB.add(book);
    }
    public List<Book> getAll() {
        return ListB;
    }
    public void remove(int id) {
        ListB.removeIf(book -> book.getId() == id);
    }
}
