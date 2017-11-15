package chapter10_strategy;

/**
 * Created by nanca on 11/15/2017.
 */
public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
