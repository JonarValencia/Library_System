public class Book {

    public String title;
    public int pages;
    public Author author;

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public String identity() {
        return "I am the Book class. My title is \"" + title +
               "\", I have " + pages +
               " pages, and I reference an author.\n";
    }
}
