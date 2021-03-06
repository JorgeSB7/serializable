package jorgesanchez.ejemplojaxb1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBManager {

    public static void marshal(List<Book> books, File f)
            throws IOException, JAXBException {
        Books myBooks = new Books();
        myBooks.setBooks(books);
        marshal(myBooks, f);
    }
    
    public static void marshal(Books myBooks, File f)
            throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(f));
        context = JAXBContext.newInstance(Books.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(myBooks, writer);
        writer.close();
    }

    public static Books unmarshal(File f) throws JAXBException {
        Books myBooks = new Books();
        JAXBContext context = JAXBContext.newInstance(Books.class);
        Unmarshaller um = context.createUnmarshaller();
        myBooks = (Books) um.unmarshal(f);
        return myBooks;
    }

    public static List<Book> unmarshalList(File f) throws JAXBException {
        return unmarshal(f).getBooks();
    }
}
