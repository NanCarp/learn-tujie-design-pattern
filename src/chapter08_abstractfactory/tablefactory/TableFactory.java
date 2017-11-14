package chapter08_abstractfactory.tablefactory;

import chapter08_abstractfactory.factory.Factory;
import chapter08_abstractfactory.factory.Link;
import chapter08_abstractfactory.factory.Page;
import chapter08_abstractfactory.factory.Tray;

/**
 * Created by nanca on 11/14/2017.
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
