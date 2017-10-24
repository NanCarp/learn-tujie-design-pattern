package chapter02_adapter.object_adapter;

import chapter02_adapter.class_adapter.Print;
import chapter02_adapter.class_adapter.PrintBanner;

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
