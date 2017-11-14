package chapter08_abstractfactory.factory;

/**
 * Created by nanca on 11/14/2017.
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
