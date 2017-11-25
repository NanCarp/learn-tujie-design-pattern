package chapter16_mediator;

import java.awt.*;
import java.awt.event.TextEvent;

/**
 * Created by nanca on 11/25/2017.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    public void setValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
