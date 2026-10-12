/**
 * Name:        BORA AVCU
 * Student ID:  250444902
 * Date:        11.10.2026
 */
package game.inventory;

public class Item {

    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    // Public Constructor.
    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // Sadece name, genre ve stockCount için public getter'lar
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    String getSerialCode() {
        return serialCode;
    }

    // Sadece bu sınıf içindeki sell metodu tarafından kullanılır.
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}