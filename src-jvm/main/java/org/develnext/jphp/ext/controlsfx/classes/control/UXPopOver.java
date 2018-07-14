package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.stage.Window;
import javafx.util.Duration;
import org.controlsfx.control.MasterDetailPane;
import org.controlsfx.control.PopOver;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import org.develnext.jphp.ext.javafx.classes.UXPopupWindow;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;



@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXPopOver")
public class UXPopOver extends UXPopupWindow<PopOver> {
    public UXPopOver(Environment env, PopOver wrappedObject) {
        super(env, wrappedObject);
    }
    public UXPopOver(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Property String title();

        @Reflection.Property boolean animated();
        @Reflection.Property boolean closeButtonEnabled();
        @Reflection.Property boolean detachable();
        @Reflection.Property boolean detached();
        @Reflection.Property boolean headerAlwaysVisible();

        @Reflection.Property double arrowIndent();
        @Reflection.Property double arrowSize();
        @Reflection.Property double cornerRadius();

        @Reflection.Property Duration fadeInDuration();
        @Reflection.Property Duration fadeOutDuration();

        @Reflection.Property PopOver.ArrowLocation arrowLocation();
        @Reflection.Property Node contentNode();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new PopOver();
    }
    @Reflection.Signature
    public void showByNode(Node owner){
        getWrappedObject().show(owner);
    }
    @Reflection.Signature
    public void showByNode(Node owner, double offset){
        getWrappedObject().show(owner, offset);
    }
    @Reflection.Signature
    public void showByNode(Node owner, double x, double y){
        getWrappedObject().show(owner, x, y);
    }
    @Reflection
    public void showByNode(Node owner, double x, double y, Duration fadeInDuration){
        getWrappedObject().show(owner, x, y, fadeInDuration);
    }
    @Reflection.Signature
    public void show(Window owner, double x, double y){
        getWrappedObject().show(owner, x, y);
    }
    @Reflection.Signature
    public void show(Window owner){
        getWrappedObject().show(owner);
    }

    @Reflection.Signature
    public void hideWithFade(Duration duration){
        getWrappedObject().hide(duration);
    }
}
