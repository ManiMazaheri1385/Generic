package products;

public class Accessory extends Product {
    private String color;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        setColor(color);
    }

    @Override
    protected String generateId() {
        return "3";
    }

    @Override
    public String toString() {
        return super.toString() + "Color: " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        this.color = color;
    }

}
