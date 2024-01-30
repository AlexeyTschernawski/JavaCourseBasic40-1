package homeworks.homework8;

public class Book {

    String bookName;
    String author;
    int numberOfPages;
    String numberInCatalog;
    Boolean bookIsInStock;

    public Book(String bookName, String author, int numberOfPages, String numberInCatalog, Boolean bookIsInStock) {
        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.numberInCatalog = numberInCatalog;
        this.bookIsInStock = bookIsInStock;
    }

    //method for redact book
    public void editorBook(int numberOfPages, String numberInCatalog, boolean bookIsInStock){
        this.numberOfPages = numberOfPages;
        this.numberInCatalog = numberInCatalog;
        this.bookIsInStock = bookIsInStock;

    }
    public void printBookInfo(){
        System.out.println("name of book: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("number of pages: " + numberOfPages);
        System.out.println("number in the catalog: " + numberInCatalog);
        System.out.println("book in the stock: " + bookIsInStock);
   }


}
