package org.develnext.jphp.ext.controlsfx.classes.cell;

import javafx.scene.control.Cell;
import javafx.scene.control.IndexedCell;
import org.controlsfx.control.GridCell;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXCell;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ControlsFXExtension.NS)
@Reflection.Name("UXGridCell")
public class UXGridCell extends UXCell<GridCell> {
    public UXGridCell(Environment env, IndexedCell wrappedObject) {
        super(env, wrappedObject);
    }

    public UXGridCell(Environment env, Cell wrappedObject) {
        super(env, wrappedObject);
    }

    public UXGridCell(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


}