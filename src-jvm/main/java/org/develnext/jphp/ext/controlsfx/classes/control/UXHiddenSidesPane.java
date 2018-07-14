package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.scene.Node;
import javafx.util.Duration;
import org.controlsfx.control.HiddenSidesPane;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXHiddenSidesPane")
public class UXHiddenSidesPane extends UXControl<HiddenSidesPane> {
    public UXHiddenSidesPane(Environment env, HiddenSidesPane wrappedObject) {
        super(env, wrappedObject);
    }
    public UXHiddenSidesPane(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Property Duration animationDelay();
        @Reflection.Property Duration animationDuration();

        @Reflection.Property double triggerDistance();

        @Reflection.Property Node content();
        @Reflection.Property Node bottom();
        @Reflection.Property Node left();
        @Reflection.Property Node right();
        @Reflection.Property Node top();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new HiddenSidesPane();
    }
}
