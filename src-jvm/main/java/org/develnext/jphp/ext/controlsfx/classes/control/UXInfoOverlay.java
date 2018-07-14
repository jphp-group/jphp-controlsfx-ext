package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.scene.Node;
import org.controlsfx.control.InfoOverlay;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXInfoOverlay")
public class UXInfoOverlay extends UXControl<InfoOverlay> {
    public UXInfoOverlay(Environment env, InfoOverlay wrappedObject) {
        super(env, wrappedObject);
    }

    public UXInfoOverlay(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Property Node content();
        @Reflection.Property boolean showOnHover();
        @Reflection.Property String text();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new InfoOverlay();
    }
    @Reflection.Signature
    public void __construct(Node content){
        __wrappedObject = new InfoOverlay();
        getWrappedObject().setContent(content);
    }
    @Reflection.Signature
    public void __construct(String text, Node content){
        __wrappedObject = new InfoOverlay(content, text);
    }
}
