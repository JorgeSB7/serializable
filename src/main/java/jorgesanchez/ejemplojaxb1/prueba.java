package jorgesanchez.ejemplojaxb1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class prueba {
    public static void main(String[] args) {
        
        Books myBooks = new Books();
        Book libro1 = new Book ("Dragones", "Jorge Sanchez", "SB", "42567");
        Book libro2 = new Book ("Dragones2", "Marina Zamora", "SB", "15678");
        myBooks.addBook(libro1); myBooks.addBook(libro2);
        
        try {
            ObjectOutputStream crear_libros= new ObjectOutputStream(new FileOutputStream("./libros.dat"));
            crear_libros.writeObject(myBooks);
            crear_libros.close();
            
        } catch (Exception e) {
            
        }
    }
}
