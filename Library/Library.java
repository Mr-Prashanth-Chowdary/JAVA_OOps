package JAVA_OOps.Library;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private Book book;

    public Library(){
    }
    public  Library(String libraryName){
        setLibraryName(libraryName);
    }
    ArrayList<Book> db = new ArrayList<>();

    public String getLibraryName() {
        return libraryName;
    }


    public void setLibraryName(String libraryName) {
        if(!(libraryName.length() < 3)){
            this.libraryName = libraryName;
        }
        else{
            throw new IllegalArgumentException("the library name should be more then 3 characters");
        }
    }


    private boolean exist(String title){
        for (Book b: db) {
            if(b.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public void addBook(Book book){
        if(!exist(book.getTitle())){
            db.add(book);
            System.out.println("The "+book.getTitle()+" is added to the library");
        }
        else{
            throw new IllegalArgumentException("the book with that title is already exist in the library");
        }
    }

    public void remove(String title){
        if(exist(title)){
            db.removeIf(b -> b.getTitle().equals(title));
        }
        else{
            System.out.println("the request is not possible. the book is not in the library");
        }
    }

    public void listBooks(){
        for(Book b: db){
            System.out.println(b.getTitle());
        }
        System.out.println();
    }

    public void find(String title){
        if(exist(title)){
            System.out.println("found the book");
        }
        else{
            System.out.println("the book is not found");
        }
    }

    @Override
    public String toString() {
        return "Library name :"+getLibraryName();
    }
}
