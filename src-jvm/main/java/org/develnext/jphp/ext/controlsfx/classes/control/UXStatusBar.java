package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import org.controlsfx.control.StatusBar;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXStatusBar")
@Reflection.Namespace(ControlsFXExtension.NS)
public class UXStatusBar extends UXControl<StatusBar> {
    public UXStatusBar(Environment env, StatusBar wrappedObject) {
        super(env, wrappedObject);
    }
    public UXStatusBar(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Property Node graphic();

        @Reflection.Property double progress();

        @Reflection.Property String styleText();
        @Reflection.Property String text();

        @Reflection.Getter ObservableList<Node> getLeftItems();
        @Reflection.Getter ObservableList<Node> getRightItems();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new StatusBar();
    }
}
