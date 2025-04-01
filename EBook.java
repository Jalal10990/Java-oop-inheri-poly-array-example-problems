class EBook extends Book {

    double fileSize;

    EBook(String title, String author, double prize, double fileSize){
        super(title, author, prize);
        this.fileSize = fileSize;
    }
    //overroding displayDetails() to show EBook details 
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Type: E-Book");
        System.out.println("File Size: " + fileSize + "MB");
        System.out.println();
    }
    
}
