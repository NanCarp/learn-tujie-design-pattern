package chapter13_visitor;

/**
 * Created by nanca on 11/20/2017.
 */
public interface Element {
    public abstract void accept(Visitor v);
}
