package chapter06_prototype.framework;

/**
 * Created by nanca on 11/12/2017.
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
