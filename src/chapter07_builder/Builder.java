package chapter07_builder;

/**
 * Created by nanca on 11/13/2017.
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
