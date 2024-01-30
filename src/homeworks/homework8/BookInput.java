package homeworks.homework8;

import homeworks.homework6.scanner.UserInput;



public class BookInput {

    UserInput input = new UserInput();

    public Book createBook(){
        String bookName = input.inputText("Please inter name of book: ");
        String author = input.inputText("please inter the author or the book: ");
        int numberOfPages = input.inputInteger("please inter number of pages: ");
        String numberInCatalog = input.inputText("please inter number in the catalog: ");
        Boolean bookInStock = input.inputBoolean("Book in the stock (true/false): ");

Book newBook = new Book(bookName,author,numberOfPages,numberInCatalog,bookInStock);
        return newBook;
    }
}
