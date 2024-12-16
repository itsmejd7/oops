package f;

public class Magazine extends Publication {
    int currentIssue;

    public Magazine(String title, double price, int copies, int currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    @Override
    public void saleCopy() {
        double totalSale = price * copies;
        System.out.println("Total sale of Magazine '" + title + "' (Issue " + currentIssue + "): " + totalSale);
    }

    public void orderQty(int additionalCopies) {
        copies += additionalCopies;
        System.out.println("Ordered " + additionalCopies + " more copies of the magazine.");
    }

    public void receiveIssue(int newIssue) {
        currentIssue = newIssue;
        System.out.println("Received new issue number: " + newIssue);
    }
}

