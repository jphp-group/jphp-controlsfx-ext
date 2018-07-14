package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.scene.Node;
import org.controlsfx.control.MaskerPane;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXMaskerPane")
public class UXMaskerPane extends UXControl<MaskerPane> {
    public UXMaskerPane(Environment env, MaskerPane wrappedObject) {
        super(env, wrappedObject);
    }

    public UXMaskerPane(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    interface WrappedInterface{
        @Reflection.Property String text();

        @Reflection.Property Node progressNode ();

        @Reflection.Property boolean progressVisible ();

        @Reflection.Property double progress();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new MaskerPane();
    }
}
