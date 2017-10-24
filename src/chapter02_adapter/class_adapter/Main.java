package chapter02_adapter.class_adapter;

/**
 * Created by nanca on 10/24/2017.
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
