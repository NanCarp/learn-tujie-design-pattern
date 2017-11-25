package chapter16_mediator;

/**
 * Created by nanca on 11/25/2017.
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);

    public abstract void setColleagueEnabled(boolean enabled);
}
