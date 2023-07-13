package main;

import bo.FruitManager;
import bo.OrderManager;
import mock.Data;
import util.Validate;

import java.util.ArrayList;

public class FruitShopSystem {

    public static void main(String[] args) {

        // load data from mock data
        FruitManager fruitBo = new FruitManager(Data.listFruit);
        OrderManager orderBo = new OrderManager();

        boolean flag = true;
        do {
            System.out.println("\nFRUIT SHOP SYSTEM");
            System.out.println("1. Create fruit");
            System.out.println("2. View orders");
            System.out.println("3. Shopping (for buyer)");
            System.out.println("4. Exit");
            int choice = Validate.getInt("Please choice one option [1-4]: ", "Only choice [1 - 4].", 1, 4);
            switch (choice) {
                case 1:
                    fruitBo.createFruit();
                    break;
                case 2:
                    orderBo.viewOrder();
                    break;
                case 3:
                    orderBo.shopping();
                    break;
                case 4:
                    return;

            }
        } while (flag);
    }
}
