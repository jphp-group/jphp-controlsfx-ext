package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.util.Duration;
import org.controlsfx.control.PopOver;
import org.controlsfx.control.RangeSlider;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXRangeSlider")
public class UXRangeSlider extends UXControl<RangeSlider> {
    public UXRangeSlider(Environment env, RangeSlider wrappedObject) {
        super(env, wrappedObject);
    }
    public UXRangeSlider(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    interface WrappedInterface{
        @Reflection.Property boolean highValueChanging();
        @Reflection.Property boolean lowValueChanging();
        @Reflection.Property boolean showTickLabels();
        @Reflection.Property boolean showTickMarks();
        @Reflection.Property boolean snapToTicks();

        @Reflection.Property double blockIncrement();
        @Reflection.Property double highValue();
        @Reflection.Property double lowValue();
        @Reflection.Property double majorTickUnit();
        @Reflection.Property double max();
        @Reflection.Property double min();

        @Reflection.Property int minorTickCount();

        @Reflection.Property Orientation orientation();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new RangeSlider();
    }
}
