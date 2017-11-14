package chapter08_abstractfactory.listfactory;

import chapter08_abstractfactory.factory.Link;

/**
 * Created by nanca on 11/14/2017.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href\"" + url + "\">" + caption + "</a></li>\n";
    }
}
