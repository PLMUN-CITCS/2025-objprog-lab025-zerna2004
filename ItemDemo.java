class Item {

    static int objectCount = 0;

    String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class ItemDemo {
    public static void main(String[] args) {

        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        Item.displayObjectCount();
    }
}
