

public class librarySystem{
    public static void main(String[] args) {
        //creating an array of Books (Polymorphism)
        Book[] books = new Book[3];

        books[0] = new printBook("Java basics", "Shah jalal", 20.0, 300);
        books[1] = new printBook("C++ basics", "Ahmad", 40.0, 250);
        books[2] = new printBook("Python basics", "Ali", 30.0, 400);
    
        //display details for all books(polymorphism)
        for(Book book : books ){
            book.displayDetails();
        }
    
    
    }
}