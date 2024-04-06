public class CanteenDemo {
    public static void main(String[] args) {
        Item[] makanan = new Item[3];

        makanan[0] = new Item("Rujak", 8000, 10);
        makanan[1] = new Item("Es Jeruk", 3000, 20);
        makanan[2] = new Item("Roti Tawar", 6000, 15);

        Item item = new Item();
        item.displayInfo(makanan);
    }
}