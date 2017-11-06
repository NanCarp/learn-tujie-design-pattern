package chapter04_factory;

import chapter04_factory.framework.Factory;
import chapter04_factory.framework.Product;
import chapter04_factory.idcard.IDCardFactory;

/**
 * Created by nanca on 11/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
