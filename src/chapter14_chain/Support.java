package chapter14_chain;

/**
 * Created by nanca on 11/21/2017.
 */
public abstract class Support {
    private String name; // 解决问题的实例名
    private Support next; // 要推卸给的对象

    public Support(String name) { // 生成解决问题的实例
        this.name = name;
    }

    public Support setNext(Support next) { // 设置要推卸给的对象
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble); // 解决问题的方法

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
