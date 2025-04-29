package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
        setId(generateId());
    }

    @Override
    protected String generateId() {
        numbers++;
        return Integer.toString(1000 + numbers);
    }

    @Override
    public String toString() {
        return String.format("%s author: %s, publication: %s, genre: %s",
                super.toString(), author, publication, genre);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
