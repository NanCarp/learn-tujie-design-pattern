package chapter11_composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nanca on 11/16/2017.
 */
public class Directory extends Entry {
    private String name; // 文件夹名字
    private ArrayList directory = new ArrayList(); // 文件夹中目录条目的集合

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) { // 增加目录条目
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
