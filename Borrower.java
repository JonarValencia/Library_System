public class Borrower {

    public String borrowerName;
    public Book borrowedBook;

    public Borrower(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void borrow(Book book) {
        this.borrowedBook = book;
    }

    public String identity() {
        return "I am the Borrower class. My name is " + borrowerName +
               " and I borrowed a book.\n";
    }
}