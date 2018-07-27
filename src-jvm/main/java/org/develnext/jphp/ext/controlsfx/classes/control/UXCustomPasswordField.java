package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import org.controlsfx.control.textfield.CustomPasswordField;
import org.controlsfx.control.textfield.CustomTextField;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXPasswordField;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXCustomPasswordField")
public class UXCustomPasswordField extends UXPasswordField {
    public UXCustomPasswordField(Environment env, PasswordField wrappedObject) {
        super(env, wrappedObject);
    }
    public UXCustomPasswordField(Environment env, CustomPasswordField wrappedObject) {
        super(env, wrappedObject);
    }
    public UXCustomPasswordField(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    public CustomPasswordField getWrappedObject(){
        return (CustomPasswordField)super.getWrappedObject();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new CustomPasswordField();
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
