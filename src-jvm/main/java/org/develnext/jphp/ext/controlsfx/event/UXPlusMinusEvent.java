package org.develnext.jphp.ext.controlsfx.event;

import javafx.event.Event;
import org.controlsfx.control.PlusMinusSlider;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.event.UXEvent;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXPlusMinusEvent")
public class UXPlusMinusEvent extends UXEvent{
    public UXPlusMinusEvent(Environment env, Event wrappedObject) {
        super(env, wrappedObject);
    }
    public UXPlusMinusEvent(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    public UXPlusMinusEvent(Environment env, PlusMinusSlider.PlusMinusEvent clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Getter double getValue();
    }
    @Override
    public PlusMinusSlider.PlusMinusEvent getWrappedObject() {
        return (PlusMinusSlider.PlusMinusEvent) super.getWrappedObject();
    }
}
