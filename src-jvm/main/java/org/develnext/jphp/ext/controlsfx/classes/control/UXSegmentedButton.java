package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.collections.ObservableList;
import javafx.scene.control.ToggleButton;
import org.controlsfx.control.SegmentedButton;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.util.List;

@Reflection.Name("UXSegmentedButton")
@Reflection.Namespace(ControlsFXExtension.NS)
public class UXSegmentedButton extends UXControl<SegmentedButton> {
    public UXSegmentedButton(Environment env, SegmentedButton wrappedObject) {
        super(env, wrappedObject);
    }
    public UXSegmentedButton(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    interface WrappedInterface{
        @Reflection.Getter ObservableList<ToggleButton> getButtons();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new SegmentedButton();
    }
    @Reflection.Signature
    public void __construct(List<ToggleButton> buttonList){
        __wrappedObject = new SegmentedButton(buttonList.toArray(new ToggleButton[0]));
    }
}
