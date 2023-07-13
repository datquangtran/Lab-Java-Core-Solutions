package entity;

import util.IConstant;
import util.Validate;

import java.util.List;

public class Fruit {

    private String fruitId;
    private String fruitName;
    private double price;
    private int quantity;
    private String origin;

    public Fruit() {
    }

    public Fruit(String fruitId, String fruitName, double price, int quantity, String origin) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFruitId() {
        return fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Display list fruit.
     */
    public void display(int no) {
        System.out.format("%7d %19s %16s %10.0f$\n",
                no,
                String.format("%1$-8s", this.fruitName),
                String.format("%1$-8s", this.origin),
                this.price
        );
    }

    private boolean exists(List<Fruit> list, String id) {
        for (Fruit fruit : list) {
            if (fruit.getFruitId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    private String getId(List<Fruit> list) {
        do {
            String id = Validate.getString("Enter fruit ID: ", "Numeric value out of range.", IConstant.FRUIT_NAME);
            if (!exists(list, id)) {
                return id;
            }
            System.out.println("ID is exist, try again.");
        } while (true);
    }

    /**
     * Create a fruit.
     *
     * @param list the list to store fruit
     */
    public void input(List<Fruit> list) {
        this.fruitId = getId(list);
        this.fruitName = Validate.getString("Enter fruit name: ", "Invalid fruit name.", IConstant.FRUIT_NAME);
        this.price = Validate.getFloat("Enter price: ", 0, Float.MAX_VALUE);
        this.quantity = Validate.getInt("Enter quantity: ", "Numeric value out of range.", 1, Integer.MAX_VALUE);
        this.origin = Validate.getString("Enter fruit origin: ", "Invalid fruit origin.", IConstant.ORIGIN);
    }
}
