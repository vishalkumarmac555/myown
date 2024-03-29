package main.java;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "book")
// arrange property/element order of xml element, this is Optional
@XmlType(propOrder = { "author", "name" })
public class Book {

    private String name;
    private String author;
    private String reviewer;
    private String id;

    public Book(String name, String author, String reviewer, String id) {
        this.name = name;
        this.author = author;
        this.reviewer = reviewer;
        this.id = id;
    }

    // If you like the variable name, e.g. "name", you can easily change this
    // name for your XML-Output:
    @XmlElement(name = "bookName")
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlAttribute
    public String getReviewer() {
        return reviewer;
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Book() {
    }

    public ArrayList<Book> getAllValues(Book book){
        List<Book> a = new ArrayList<Book>();
        a.add(book);
        System.out.println( a.get(0).author);
        return (ArrayList<Book>) a;
    }

}