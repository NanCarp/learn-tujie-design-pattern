package chapter08_abstractfactory.factory;

/**
 * Created by nanca on 11/14/2017.
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
