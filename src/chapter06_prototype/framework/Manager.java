package chapter06_prototype.framework;

import java.util.HashMap;

/**
 * Created by nanca on 11/12/2017.
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
