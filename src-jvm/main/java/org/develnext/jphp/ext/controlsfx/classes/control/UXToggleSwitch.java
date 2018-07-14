package org.develnext.jphp.ext.controlsfx.classes.control;

import org.controlsfx.control.ToggleSwitch;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXLabeled;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXToggleSwitch")
@Reflection.Namespace(ControlsFXExtension.NS)
public class UXToggleSwitch extends UXLabeled<ToggleSwitch> {
    public UXToggleSwitch(Environment env, ToggleSwitch wrappedObject) {
        super(env, wrappedObject);
    }
    public UXToggleSwitch(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Property boolean selected();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new ToggleSwitch();
    }
    @Reflection.Signature
    public void __construct(String text){
        __wrappedObject = new ToggleSwitch(text);
    }
}
