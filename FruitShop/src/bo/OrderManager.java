package bo;

import entity.Fruit;
import util.IConstant;
import util.Validate;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mock.Data;

public class OrderManager {

    private final Hashtable<String, ArrayList<Fruit>> orders = new Hashtable();
    private final ArrayList<Fruit> listFruitsInOrder = new ArrayList<>();

    public Fruit getFruit(int item) {
        int count = 0;
        for (Fruit fruit : listFruitsInOrder) {
            if (fruit.getQuantity() != 0) {
                count++;
            }
            if (item == count) {
                return fruit;
            }
        }
        return null;
    }

    public Fruit checkFruitInOrder(String id) {
        for (Fruit fruit : listFruitsInOrder) {
            if (fruit.getFruitId().equalsIgnoreCase(id)) {
                return fruit;
            }
        }
        return null;
    }

    public void shopping() {
        ArrayList<Fruit> listFruitsInShopping = new ArrayList<>();
        FruitManager fB = new FruitManager(Data.listFruit);
        while (true) {
            int item = fB.displayListFruit();
            if (item == -1) {
                System.out.println("Out of stock");
                return;
            }
            Fruit fruit = fB.getFruit(item); // Use fB to call getFruit() from FruitBo
            System.out.println("You selected: " + fruit.getFruitName());
            int quantity = Validate.getInt(
                    "Please input quantity: ",
                    "Only choice [1 - " + fruit.getQuantity() + "].",
                    1,
                    fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);
            Fruit fruitInShopping = checkFruitInOrder(fruit.getFruitId());
            if (fruitInShopping != null) {
                fruitInShopping.setQuantity(fruitInShopping.getQuantity() + quantity);
            } else if (quantity != 0) {
                listFruitsInShopping.add(new Fruit(fruit.getFruitId(),
                        fruit.getFruitName(),
                        fruit.getPrice(),
                        quantity,
                        fruit.getOrigin()));
            }
            if (!Validate.checkInputYN("Do you want to continue? ")) {
                break;
            }
        }
        if (listFruitsInShopping.isEmpty()) {
            System.out.println("No Order");
        } else {
            double total = 0;
            System.out.printf("%-15s%-15s%-15s%-15s%n", "Product", "Quantity", "Price", "Amount");
            for (Fruit fruit : listFruitsInShopping) {
                System.out.printf("%-15s%-15d$%-15.0f$%-15.0f%n",
                        fruit.getFruitName(),
                        fruit.getQuantity(),
                        fruit.getPrice(),
                        fruit.getPrice() * fruit.getQuantity());
                total += fruit.getPrice() * fruit.getQuantity();
            }
            System.out.println("Total: " + total);
            String name = setName();
            orders.put(name, listFruitsInShopping);
        }
    }

//    public void displayListOrder(ArrayList<Fruit> listOrder) {
//        double total = 0;
//        System.out.printf("%-15s%-15s%-15s%-15s%n", "Product", "Quantity", "Price", "Amount");
//        for (Fruit fruit : listOrder) {
//            System.out.printf("%-15s%-15d$%-15.0f$%-15.0f%n",
//                    fruit.getFruitName(),
//                    fruit.getQuantity(),
//                    fruit.getPrice(),
//                    fruit.getPrice() * fruit.getQuantity());
//            total += fruit.getPrice() * fruit.getQuantity();
//        }
//        System.out.println("Total: " + total);
//    }

    public String setName() {
        String name = Validate.getString("Enter name: ", "Invalid", IConstant.CUSTOMER_NAME);
        int count = 0;
        for (String name_key : orders.keySet()) {
            String real_name = name_key.split("#")[0];
            if (name.equals(real_name)) {
                count++;
            }
        }
        return name + "#" + count;
    }

    public void viewOrder() {
//        if (orders.isEmpty()) {
//            System.out.println("No orders");
//            return;
//        }
//        for (String name : orders.keySet()) {
//            System.out.println("Customer: " + name.split("#")[0]);
//            ArrayList<Fruit> listOrder = orders.get(name);
//            displayListOrder(listOrder);
//        }
        if (orders.isEmpty()) {
            System.out.println("No orders");
            return;
        }
        orders.forEach((customerName, orderList) -> {
            System.out.println("Customer: " + customerName.split("#")[0]);
            double total = 0;
            System.out.printf("%-15s%-15s%-15s%-15s%n", "Product", "Quantity", "Price", "Amount");

            for (Fruit fruit : orderList) {
                System.out.printf("%-15s%-15d$%-15.0f$%-15.0f%n",
                        fruit.getFruitName(),
                        fruit.getQuantity(),
                        fruit.getPrice(),
                        fruit.getPrice() * fruit.getQuantity());
                total += fruit.getPrice() * fruit.getQuantity();
            }
            System.out.println("Total: $" + total);
            System.out.println("--------------------");
        });

    }
}
