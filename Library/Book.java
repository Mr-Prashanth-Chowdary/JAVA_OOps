package JAVA_OOps.Library;

public class Book {
    private String title;
    private String author;
    private String isbn;


    public Book(String title,String author, String isbn){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "\n Title :"+getTitle()+"\n Author :"+getAuthor()+"\n Isbn :"+getIsbn();
    }
}
