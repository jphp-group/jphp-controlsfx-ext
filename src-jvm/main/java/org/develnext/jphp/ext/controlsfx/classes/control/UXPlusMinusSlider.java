package org.develnext.jphp.ext.controlsfx.classes.control;


import javafx.geometry.Orientation;
import org.controlsfx.control.PlusMinusSlider;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXPlusMinusSlider")
@Reflection.Namespace(ControlsFXExtension.NS)
public class UXPlusMinusSlider extends UXControl<PlusMinusSlider> {
    public UXPlusMinusSlider(Environment env, PlusMinusSlider wrappedObject) {
        super(env, wrappedObject);
    }
    interface WrappedInterface{
        @Reflection.Property Orientation orientation();
        @Reflection.Property double value();
    }

    public UXPlusMinusSlider(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new PlusMinusSlider();
    }
}
