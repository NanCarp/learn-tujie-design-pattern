package chapter21_proxy;

/**
 * Created by nanca on 11/30/2017.
 */
public interface Printable {
    public abstract void setPrinterName(String name);

    public abstract String getPrinterName();

    public abstract void print(String string);
}
