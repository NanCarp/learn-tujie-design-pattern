package chapter04_factory.idcard;

import chapter04_factory.framework.Factory;
import chapter04_factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanca on 11/6/2017.
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
