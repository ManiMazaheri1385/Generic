package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    protected abstract String generateId();

    @Override
    public String toString() {
        return "";
    }

}
