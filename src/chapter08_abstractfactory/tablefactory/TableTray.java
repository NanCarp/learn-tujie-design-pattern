package chapter08_abstractfactory.tablefactory;

import chapter08_abstractfactory.factory.Tray;

/**
 * Created by nanca on 11/14/2017.
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
