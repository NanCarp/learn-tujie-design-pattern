package chapter19_state;

/**
 * Created by nanca on 11/28/2017.
 */
public interface Context {
    public abstract void setClock(int hout);

    public abstract void changeState(State state);

    public abstract void callSecurityCenter(String msg);

    public abstract void recordLog(String msg);
}
