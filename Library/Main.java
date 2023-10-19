package JAVA_OOps.Library;

public class Main {
    public static void main(String[] args) {
        Library l1 = new Library("KLU-VJ Library");

        //books
        Book b1 = new Book("the man","Prashanth","1234");
        Book b2 = new Book("the flip","philp","345");
        Book b3 = new Book("the dragon","joe","1455");
        Book b4 = new Book("the dino","ram","1246");

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);
        l1.addBook(b4);

        //list before removing a book
        l1.listBooks();
        //list after removing a book
        l1.remove("the man");
        System.out.println();
        //the find method
        l1.find("the dino");
        l1.find("the man");

        //list of all books

        l1.listBooks();
    }
}
