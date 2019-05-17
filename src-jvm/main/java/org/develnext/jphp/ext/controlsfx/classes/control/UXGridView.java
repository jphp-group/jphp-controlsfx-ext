package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.collections.ObservableList;
import org.controlsfx.control.GridCell;
import org.controlsfx.control.GridView;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.controlsfx.classes.cell.UXGridCell;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXGridView")
public class UXGridView extends UXControl<GridView> {
    public UXGridView(Environment env, GridView wrappedObject) {
        super(env, wrappedObject);
    }
    public UXGridView(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Getter ObservableList getItems();

        @Reflection.Property double cellHeight();
        @Reflection.Property double cellWidth();
        @Reflection.Property double horizontalCellSpacing();
        @Reflection.Property double verticalCellSpacing();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new GridView<>();
    }

    @Reflection.Signature
    @SuppressWarnings("unchecked")
    public void setCellFactory(Environment env, Invoker invoker){
        if(invoker == null){
            getWrappedObject().setCellFactory(null);
        }
        else{
            getWrappedObject().setCellFactory((grid) -> new GridCell(){
                @Override
                protected void updateItem(Object item, boolean empty) {
                    if(empty){
                        setGraphic(null);
                        setText(null);
                    }
                    else{
                        invoker.callAny(new UXGridCell(env, this), item);
                    }
                }
            });
        }
    }
}
