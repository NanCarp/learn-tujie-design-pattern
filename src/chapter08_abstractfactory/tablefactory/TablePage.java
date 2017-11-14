package chapter08_abstractfactory.tablefactory;

import chapter08_abstractfactory.factory.Page;

/**
 * Created by nanca on 11/14/2017.
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
