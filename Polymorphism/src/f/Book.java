package f;

public class Book extends Publication {
    String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    @Override
    public void saleCopy() {
        double totalSale = price * copies;
        System.out.println("Total sale of Book '" + title + "' by " + author + ": " + totalSale);
    }

    public void orderCopies(int additionalCopies) {
        copies += additionalCopies;
        System.out.println("Ordered " + additionalCopies + " more copies of the book.");
    }
}
