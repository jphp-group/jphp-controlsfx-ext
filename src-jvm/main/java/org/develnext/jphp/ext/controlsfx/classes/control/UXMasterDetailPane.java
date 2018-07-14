package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.geometry.Side;
import javafx.scene.Node;
import org.controlsfx.control.MaskerPane;
import org.controlsfx.control.MasterDetailPane;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXMasterDetailPane")
public class UXMasterDetailPane extends UXControl<MasterDetailPane> {
    public UXMasterDetailPane(Environment env, MasterDetailPane wrappedObject){
        super(env, wrappedObject);
    }

    public UXMasterDetailPane(Environment env, ClassEntity clazz){
        super(env, clazz);
    }
    interface WrappedInterface{
        @Reflection.Property boolean showDetailNode();
        @Reflection.Property boolean animated();

        @Reflection.Property double dividerSizeHint();
        @Reflection.Property double dividerPosition();

        @Reflection.Property Node masterNode();
        @Reflection.Property Node detailNode();

        @Reflection.Property Side detailSide();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new MasterDetailPane();
    }
}
