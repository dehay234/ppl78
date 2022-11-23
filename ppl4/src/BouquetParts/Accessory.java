package BouquetParts;

public class Accessory {
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "variety='" + variety + '\'' +
                ", price=" + price +
                '}';
    }
}
