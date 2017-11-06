package chapter03_template;

import java.util.AbstractCollection;

/**
 * Created by nanca on 10/25/2017.
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
