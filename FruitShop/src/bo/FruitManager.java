package bo;

import entity.Fruit;

import java.util.ArrayList;
import java.util.List;

import util.IConstant;
import util.Validate;

public class FruitManager {

    private List<Fruit> list;

    public FruitManager() {
        this.list = new ArrayList<>();
    }

    public FruitManager(List<Fruit> list) {
        this.list = list;
    }

    public List<Fruit> getList() {
        return list;
    }

    public Fruit getFruitById(String id) {
        for (Fruit fruit : list) {
            if (id.equals(fruit.getFruitId())) {
                return fruit;
            }
        }
        return null;
    }

    public void createFruit() {
        while (true) {
            String fruitId = Validate.getString("Enter Id: ", "Invalid", IConstant.FRUIT_NAME);
            if (getFruitById(fruitId) != null) {
                System.out.println("ID is existed");
                continue;
            }
            String fruitName = Validate.getString("Enter Name: ", "Invalid", IConstant.FRUIT_NAME);
            double price = Validate.getDouble("Enter price: ", 1, Double.MAX_VALUE);
            int quantity = Validate.getInt("Enter Quantity: ", "Invalid", 1, Integer.MAX_VALUE);
            String origin = Validate.getString("Enter Origin: ", "Invalid", IConstant.ORIGIN);
            list.add(new Fruit(fruitId, fruitName, price, quantity, origin));
            if (!Validate.checkInputYN("Do you want to continue ?")) {
                break;
            }
        }
    }

    public int displayListFruit() {
        int countItem = 0;
        if (list.isEmpty()) {
            return -1;
        }
        System.out.printf("%-10s%-20s%-20s%-15s%-15s%n", 
                "Item", 
                "Fruit Name", 
                "Origin", 
                "Price", 
                "Quantity");
        for (Fruit fruit : list) {
            if (fruit.getQuantity() == 0) {
                continue;
            }
            countItem++;
            System.out.printf("%-10d%-20s%-20s$%-14.0f%-15d%n", 
                    countItem, 
                    fruit.getFruitName(), 
                    fruit.getOrigin(), 
                    fruit.getPrice(), 
                    fruit.getQuantity());
        }
        if (countItem == 0) {
            return -1;
        }
        return Validate.getInt(
                    "\nEnter select item: ",
                    "Only choice [1 - " + countItem+ "].",
                    1,
                    countItem
        );
    }

    public Fruit getFruit(int item) {
        int count = 0;
        for (Fruit fruit : list) {
            if (fruit.getQuantity() != 0) {
                count++;
            }
            if (item == count) {
                return fruit;
            }
        }
        return null;
    }

}
