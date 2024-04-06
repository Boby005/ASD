public class Item {
    public String name;
    public double price;
    public int stock;

    public Item() {

    }

    public Item(String itemName, double itemPrice, int itemStock) {
        name = itemName;
        price = itemPrice;
        stock = itemStock;
    }

    public void displayInfo(Item[] makanan) {
       for(int i=0; i<makanan.length; i++){
        System.out.println("Nama makanan : "+makanan[i].name);
        System.out.println("Harga makanan : "+makanan[i].price);
        System.out.println("Stok makanan : "+makanan[i].stock);
       }
    }
}