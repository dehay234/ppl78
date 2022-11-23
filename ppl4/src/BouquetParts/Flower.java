package BouquetParts;

import java.util.Comparator;
import java.util.Scanner;

public class Flower {

    private int id;
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
    public String changeProperties(int choice){
        int copy;
        System.out.println("Select which properties you want to change:\n" +
                "1. Variety\n" +
                "2. Length\n" +
                "3. Freshness\n" +
                "4. Price");
        Scanner scanner = new Scanner(System.in);
        if(choice==0)choice = scanner.nextInt();
        if(choice == 1){
            System.out.print("Enter new variety: ");
            variety = scanner.nextLine();
            System.out.println("New variety was set");
            return "New variety was set";
        }
        else if(choice == 2){
            System.out.print("Enter new length: ");
            copy = scanner.nextInt();
            if(copy<0||copy>100) {
                System.out.println("Wrong length");
                return "Wrong length";
            }
            else{
                length = copy;
                System.out.println("New length was set");
                return "New length was set";
            }
        }
        else if(choice == 3){
            System.out.print("Enter new freshness: ");
            copy = scanner.nextInt();
            if(copy<1||copy>3) {
                System.out.println("Wrong freshness");
                return "Wrong freshness";
            }
            else{
                freshness = copy;
                System.out.println("New freshness was set");
                return "New freshness was set";
            }
        }
        else if(choice == 4){
            System.out.print("Enter new price: ");
            copy = scanner.nextInt();
            if(copy<0||copy>1000) {
                System.out.println("Wrong price");
                return  "Wrong price";
            }
            else{
                price = copy;
                System.out.println("New price was set");
                return "New price was set";
            }
        }
        return "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
