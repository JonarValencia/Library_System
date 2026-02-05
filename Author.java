public class Author {

    public String name;

    public Author(String name) {
        this.name = name;
    }

    public String identity() {
        return "I am the Author class. I represent the writer of a book. My name is "
                + name + ".\n";
    }
}