package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        setAuthor(author);
        setPublication(publication);
        setGenre(genre);
    }

    @Override
    protected String generateId() {
        return "1";
    }

    @Override
    public String toString() {
        return super.toString() + "Author: " + author + ", Publication: " + publication + ", Genre: " + genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        if (publication == null || publication.isEmpty()) {
            throw new IllegalArgumentException("Publication cannot be null or empty");
        }
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.isEmpty()) {
            throw new IllegalArgumentException("Genre cannot be null or empty");
        }
        this.genre = genre;
    }

}
