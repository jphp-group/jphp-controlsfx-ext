package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.scene.Node;
import org.controlsfx.control.NotificationPane;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXNotificationPane")
public class UXNotificationPane extends UXControl<NotificationPane> {
    public UXNotificationPane(Environment env, NotificationPane wrappedObject) {
        super(env, wrappedObject);
    }
    public UXNotificationPane(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Property boolean closeButtonVisible();
        @Reflection.Property boolean showFromTop();
        @Reflection.Property boolean showing();

        @Reflection.Property String text();

        @Reflection.Property Node content();
        @Reflection.Property Node graphic();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new NotificationPane();
    }
    @Reflection.Signature
    public void __construct(Node content){
        __wrappedObject = new NotificationPane(content);
    }
    @Reflection.Signature
    public void showNotification(){
        getWrappedObject().show();
    }
    @Reflection.Signature
    public void showNotification(String text){
        getWrappedObject().show(text);
    }
    @Reflection.Signature
    public void showNotification(String text, Node content){
        getWrappedObject().show(text, content);
    }
    @Reflection.Signature
    public void hideNotification(){
        getWrappedObject().hide();
    }
}
