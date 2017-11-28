package chapter19_state;

/**
 * Created by nanca on 11/28/2017.
 */
public interface State {
    public abstract void doClock(Context context, int hour);
    public abstract void doUse(Context context);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}
