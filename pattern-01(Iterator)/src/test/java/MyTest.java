import com.superlilu.dao.Iterator;
import com.superlilu.pojo.Book;
import com.superlilu.inheritAdapter.utils.BookShelf;
import org.junit.Test;

public class MyTest {
    @Test
    public void Test_Iterator() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.addBook(new Book("AList Use Introduction"));
        bookShelf.addBook(new Book("Bad guy"));
        bookShelf.addBook(new Book("Creation of human"));
        bookShelf.addBook(new Book("Dao De Jing"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
