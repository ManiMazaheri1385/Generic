import products.*;
import inventory.*;

public class Main {
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double totalPrice = 0.0;
        for (Product item : inventory.getItems()) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        Book theLittlePrince = new Book("The Little Prince", 16.90, "Antoine de Saint-Exupery", "ofoq", "Novella");
        Book lesMiserables = new Book("Les Miserables", 23.99, "Victor Hugo", "ofoq", "Novel");

        Notebook hardCoverNotebook = new Notebook("Hard Cover Notebook", 19.97, 100, true);
        Notebook softCoverNotebook = new Notebook("Soft Cover Notebook", 12.30, 80, false);

        Accessory lampshade = new Accessory("Lampshade", 57.34, "Yellow");
        Accessory vase = new Accessory("Vase", 34.99, "Green");

        bookInventory.addItems(theLittlePrince);
        bookInventory.addItems(lesMiserables);

        notebookInventory.addItems(hardCoverNotebook);
        notebookInventory.addItems(softCoverNotebook);

        accessoryInventory.addItems(lampshade);
        accessoryInventory.addItems(vase);

        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Books:");
        System.out.println();
        bookInventory.displayAll();

        System.out.println("Notebooks:");
        System.out.println();
        notebookInventory.displayAll();

        System.out.println("Accessories:");
        System.out.println();
        accessoryInventory.displayAll();

        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        notebookInventory.removeItemsById(softCoverNotebook.getId());
        accessoryInventory.removeItemsById(lampshade.getId());

        System.out.println("Total book price: " + String.format("%.2f", calculateTotalPrice(bookInventory)));
        System.out.println("Total notebook price: " + String.format("%.2f", calculateTotalPrice(notebookInventory)));
        System.out.println("Total accessory price: " + String.format("%.2f", calculateTotalPrice(accessoryInventory)));

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        Book lostBook = bookInventory.findItemsById(theLittlePrince.getId());
        System.out.println("Lost book:\n" + lostBook);
        System.out.println();
        Accessory lostAccessory = accessoryInventory.findItemsById(lampshade.getId());

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        bookInventory.applyDiscount(lesMiserables.getTitle(), 10);
        System.out.println("Apply 10% discount on Les Miserables book: " + String.format("%.2f", calculateTotalPrice(bookInventory)));
        accessoryInventory.applyDiscount(vase.getTitle(), 25);
        System.out.println("Apply 25% discount on Vase: " + String.format("%.2f", calculateTotalPrice(accessoryInventory)));

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Books:");
        System.out.println();
        bookInventory.displayAll();

        System.out.println("Notebook:");
        System.out.println();
        notebookInventory.displayAll();

        System.out.println("Accessory:");
        System.out.println();
        accessoryInventory.displayAll();

        System.out.println("------------------------------------------------------------------------");

    }
}