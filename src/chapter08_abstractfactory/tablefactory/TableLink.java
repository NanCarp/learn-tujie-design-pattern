package chapter08_abstractfactory.tablefactory;

import chapter08_abstractfactory.factory.Link;

/**
 * Created by nanca on 11/14/2017.
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
