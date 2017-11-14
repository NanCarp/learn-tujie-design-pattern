package chapter08_abstractfactory.factory;

import java.util.ArrayList;

/**
 * Created by nanca on 11/14/2017.
 */
public abstract class Tray extends Item{
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
