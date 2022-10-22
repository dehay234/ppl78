package BouquetParts;

import java.util.Comparator;

public class Flower {


    private String variety;
    private int freshness;
    private int length;
    private int price;

    public Flower(String variety, int freshness, int length, int price) {
        this.variety = variety;
        this.freshness = freshness;
        this.length = length;
        this.price = price;
    }

    public Flower(){}


    public int getLength() {
        return length;
    }

    public String getVariety() {
        return variety;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getPrice() {
        return price;
    }
    public void changeProperties(){
        System.out.println("\t//Changing...//");
        price = 10;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "variety='" + variety + '\'' +
                ", freshness=" + freshness +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
