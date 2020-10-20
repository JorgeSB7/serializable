package jorgesanchez.ejemplojaxb1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "books")
public class Books implements Serializable {

    @XmlElement(name = "book", type = Book.class)
    private List<Book> books = new ArrayList<>();

    Books() {
    }
    
    /**
     * @return the books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void addBook(Book v) {
        this.books.add(v);
    }
    
    
    
}
