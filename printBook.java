class printBook extends Book {
    int numberOfPages;

    printBook(String title, String author, double price, int numberOfPages) {

        super(title, author, price);
        this.numberOfPages = numberOfPages;
    }

    // overriding displayDetails() to show printBook details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("type: Printed Book");
        System.out.println("pages: " + numberOfPages);
        System.out.println();
    }

}
