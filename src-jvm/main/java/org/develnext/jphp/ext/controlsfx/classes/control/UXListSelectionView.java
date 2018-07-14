package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import org.controlsfx.control.ListSelectionView;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXListSelectionView")
public class UXListSelectionView extends UXControl<ListSelectionView> {
    public UXListSelectionView(Environment env, ListSelectionView wrappedObject) {
        super(env, wrappedObject);
    }
    public UXListSelectionView(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    interface WrappedInterface{
        @Reflection.Property Orientation orientation();

        @Reflection.Property Node sourceFooter();
        @Reflection.Property Node sourceHeader();
        @Reflection.Property Node targetFooter();
        @Reflection.Property Node targetHeader();

        @Reflection.Property ObservableList sourceItems();
        @Reflection.Property ObservableList targetItems();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new ListSelectionView<>();
    }
}
