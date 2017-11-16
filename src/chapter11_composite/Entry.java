package chapter11_composite;

/**
 * Created by nanca on 11/16/2017.
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() { // 显示目录条目一览
        printList("");
    }

    protected abstract void printList(String prefix); // 为一览加上前缀并显示条目一览

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
