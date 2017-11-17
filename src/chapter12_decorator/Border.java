package chapter12_decorator;

/**
 * Created by nanca on 11/17/2017.
 */
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
