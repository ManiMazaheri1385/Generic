package inventory;

import products.Product;
import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void applyDiscount(String productName, int discount) {
        for (T item : items) {
            if (productName.equals(item.getTitle())) {
                item.setPrice(item.getPrice() * (100 - discount)/100);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemsById(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                items.remove(item);
                System.out.println("Item removed.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public T findItemsById(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        System.out.println("Item not found.");
        return null;
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
            System.out.println();
        }
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

}
