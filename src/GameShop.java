import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // 3 Item objesi oluşturulur. Daha sonra satma işlemi için referansları elimizde tutmalıyız.
        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        // Envantere ekleme işlemi.
        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        shop.displayAll();

        System.out.println();

        // Satma işlemleri.
        item1.sell(4); // Başarılı.
        item2.sell(6); // Uyarı Vermeli.

        System.out.println();

        shop.displayAll();

        System.out.println();

        shop.auditSerialCodes();
    }
}