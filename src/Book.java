/**
 * This program represents a Book class.
 * It provides methods to set and get book details.
 * @author User
 */
public class Book {
    // Data members
    private String title;
    private int price;
    private int year;
    private String author;

    // Default Constructor
    public Book() {
        title = "";
        price = 0;
        year = 0;
        author = "";
    }

    // Normal Constructor
    public Book(String title, int price, int year, String author) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }

    // Accessor: Returns the title of this book
    public String getTitle() {
        return title;
    }

    // Accessor: Returns the price of this book
    public int getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
    // Mutator: Assigns the data of this book
    public void setData(String bookTitle, int bookPrice, int bookYear, String bookAuthor) {
        title = bookTitle;
        price = bookPrice;
        year = bookYear;
        author = bookAuthor;
    }

    // Display all information: return the string representation of the object
    public String toString() {
        return "\nTitle: " + title + ", Price: " + price + ", Year: " + year + ", Author: " + author;
    }
}

