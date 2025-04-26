package products;

public class Accessory extends Product {
    private String color;

    @Override
    protected String generateId() {
        return "";
    }

    @Override
    public String toString() {
        return "";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
