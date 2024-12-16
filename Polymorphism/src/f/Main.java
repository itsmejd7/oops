package f;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", 50.0, 100, "John Doe");
        book.saleCopy();
        book.orderCopies(50);
        book.saleCopy();

        Magazine magazine = new Magazine("Tech World", 10.0, 200, 5);
        magazine.saleCopy();
        magazine.orderQty(100);
        magazine.receiveIssue(6);
        magazine.saleCopy();
    }
}

