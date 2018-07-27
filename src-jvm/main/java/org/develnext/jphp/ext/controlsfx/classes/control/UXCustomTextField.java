package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.scene.Node;
import org.controlsfx.control.textfield.CustomTextField;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXTextField;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXCustomTextField")
public class UXCustomTextField extends UXTextField<CustomTextField> {
    public UXCustomTextField(Environment env, CustomTextField wrappedObject) {
        super(env, wrappedObject);
    }
    public UXCustomTextField(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new CustomTextField();
    }

    @Reflection.Setter
    public void setLeft(@Reflection.Nullable Node node) {
        getWrappedObject().setLeft(node);
    }
    @Reflection.Getter
    public Node getLeft() {
        return getWrappedObject().getLeft();
    }

    @Reflection.Setter
    public void setRight(@Reflection.Nullable Node node) {
        getWrappedObject().setRight(node);
    }
    @Reflection.Getter
    public Node getRight() {
        return getWrappedObject().getLeft();
    }
}