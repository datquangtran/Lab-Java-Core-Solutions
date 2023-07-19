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
    private double amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    

    public void display(int no) {
        System.out.format("%d.%10s %4d %10.0f$ %8.0f$\n",
                no,
                String.format("%1$-10s", this.fruitName),
                this.quantity,
                this.price,
                this.amount);
    }
}
