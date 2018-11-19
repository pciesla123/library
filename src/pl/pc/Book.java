package pl.pc;

public class Book {

    private String title;
    private String author;
    private int numberOfPages;
    private BookType type;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public Book(String title, String author, int numberOfPages, BookType type) {

        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.type = type;

    }

    public Book() {

    }

}
