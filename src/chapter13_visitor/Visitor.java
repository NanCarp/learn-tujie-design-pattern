package chapter13_visitor;

/**
 * Created by nanca on 11/20/2017.
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
