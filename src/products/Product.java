package products;

public abstract class Product {
    private static int identifier = 1;
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        setId(String.valueOf(Integer.parseInt(generateId())*1000 + identifier));
        identifier++;
    }

    protected abstract String generateId();

    @Override
    public String toString() {
        return "Title: " + title + ", Price: $" + String.format("%.2f", price) + ", ID: " + id + "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == null || price < 0) {
            throw new IllegalArgumentException("Price cannot be null or negative");
        }
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 4) {
            throw new IllegalArgumentException("ID must be 4 digits long");
        }
        this.id = id;
    }

}
