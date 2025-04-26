package inventory;

import products.Product;
import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void applyDiscount(String productName, int discount) {}

    public void addItems(T product) {}

    public void removeItemsById(String id) {}

    public T findItemsById(String id) {
        return null;
    }

    public void displayAll() {}

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

}
