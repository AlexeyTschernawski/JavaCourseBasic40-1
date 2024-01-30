package homeworks.homework8;

public class BookDemo {
    public static void main(String[] args) {

        BookInput input = new BookInput();

        System.out.println("please inter book 1");
        Book book1 = input.createBook();

        System.out.println("please inter book 2");
        Book book2 = input.createBook();

        book1.printBookInfo();
        System.out.println("------------------------");
        book2.printBookInfo();

    }

}
