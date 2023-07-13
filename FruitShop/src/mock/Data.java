package mock;

import entity.Fruit;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Mock initial data.
 */
public class Data {

    public static List<Fruit> listFruit = new ArrayList<Fruit>() {
        {
            add(new Fruit("1", "Coconut", 2, 10, "Vietnam"));
            add(new Fruit("2", "Orange", 3, 10, "US"));
            add(new Fruit("3", "Apple", 4, 10, "Thailand"));
            add(new Fruit("4", "Grape", 6, 10, "France"));
            add(new Fruit("5", "Mango", 2, 10, "Vietnam"));
        }
    };
}
