package chapter18_memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanca on 11/27/2017.
 */
public class Memento {
    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List)fruits.clone();
    }
}
