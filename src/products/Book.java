package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;

    @Override
    protected String generateId() {
        return "";
    }

    @Override
    public String toString() {

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
