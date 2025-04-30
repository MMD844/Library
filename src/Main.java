import Products.*;
import inventory.Inventory;

public class Main {

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
    double total = 0;
    for (Product item : inventory.getItems()) {
        total += item.getPrice();
    }
    return total;
}

    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<NoteBook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItem(new Book("Check Book", 45.20, "Check author", "Check Pub", "Educational"));
        bookInventory.addItem(new Book("Art in Iran", 39.90, "Ali mosoudi", "Madrese Pub", "Technical"));

        notebookInventory.addItem(new NoteBook("A4 Notebook", 12.99, 120, true));
        notebookInventory.addItem(new NoteBook("Pocket Notebook", 7.99, 60, false));

        accessoryInventory.addItem(new Accessory("Pen", 2.87, "Blue"));
        accessoryInventory.addItem(new Accessory("Pencil", 1.43, "Red"));

        System.out.println("---- All Books ----");
        bookInventory.displayAll();

        System.out.println("\n---- All Notebooks ----");
        notebookInventory.displayAll();

        System.out.println("\n---- All Accessories ----");
        accessoryInventory.displayAll();

        bookInventory.removeItemById("1001");
        notebookInventory.removeItemById("2002");

        System.out.println("\nTotal price of books: " + calculateTotalPrice(bookInventory));
        System.out.println("\nTotal price of notebooks: " + calculateTotalPrice(notebookInventory));
        System.out.println("\nTotal price of accessories: " + calculateTotalPrice(accessoryInventory));

        System.out.println("\nSearching for items:");
        Product found = notebookInventory.findItemById("2003");
        if (found != null) {
            System.out.println("Found: " + found);
        }
        bookInventory.findItemById("9999");

        bookInventory.applyDiscount("Design Patterns", 10);
        accessoryInventory.applyDiscount("Pen", 20);

        System.out.println("\n---- Final State ----");
        bookInventory.displayAll();
        notebookInventory.displayAll();
        accessoryInventory.displayAll();
    }
}