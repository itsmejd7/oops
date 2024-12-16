package f;

public class Publication {
    String title;
    double price;
    int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public void saleCopy() {
        double totalSale = price * copies;
        System.out.println("Total sale of " + title + ": " + totalSale);
    }
}
