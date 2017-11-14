package chapter08_abstractfactory.listfactory;

import chapter08_abstractfactory.factory.Factory;
import chapter08_abstractfactory.factory.Link;
import chapter08_abstractfactory.factory.Page;
import chapter08_abstractfactory.factory.Tray;

/**
 * Created by nanca on 11/14/2017.
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
