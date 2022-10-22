package BouquetParts;

public class Accessory {
    String variety;
    int price;

    public Accessory(String variety, int price) {
        this.variety = variety;
        this.price = price;
    }

    public String getVariety() {
        return variety;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "variety='" + variety + '\'' +
                ", price=" + price +
                '}';
    }
}
