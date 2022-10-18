package minitest2;

public class Book {
    private int bookCode;
    public String name;
    public int price;
    public String author;
    public Book(){

    }

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode; // Mã số
        this.name = name;
        this.price = price;
        this.author = author; // Tác giả
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
