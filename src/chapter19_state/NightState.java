package chapter19_state;

/**
 * Created by nanca on 11/28/2017.
 */
public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {

    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 || 17 > hour) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急：晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    public String toString() {
        return "[晚上]";
    }
}
