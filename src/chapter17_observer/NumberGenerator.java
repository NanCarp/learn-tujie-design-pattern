package chapter17_observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nanca on 11/26/2017.
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList(); // 保存 Observer 们

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    public abstract int getNumber(); // 获取数值

    public abstract void  execute(); //  生成数值
}
