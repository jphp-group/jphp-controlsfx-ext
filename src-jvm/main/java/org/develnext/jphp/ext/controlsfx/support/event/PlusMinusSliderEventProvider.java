package org.develnext.jphp.ext.controlsfx.support.event;

import javafx.event.EventHandler;
import org.controlsfx.control.NotificationPane;
import org.controlsfx.control.PlusMinusSlider;
import org.develnext.jphp.ext.javafx.support.EventProvider;

public class PlusMinusSliderEventProvider extends EventProvider<PlusMinusSlider> {
    public PlusMinusSliderEventProvider(){
        setHandler("valueChanged", new Handler() {
            @Override
            public void set(PlusMinusSlider target, EventHandler eventHandler) {
                target.setOnValueChanged(eventHandler);
            }

            @Override
            public EventHandler get(PlusMinusSlider target) {
                return target.getOnValueChanged();
            }
        });
    }

    @Override
    public Class<PlusMinusSlider> getTargetClass() {
        return PlusMinusSlider.class;
    }
}
