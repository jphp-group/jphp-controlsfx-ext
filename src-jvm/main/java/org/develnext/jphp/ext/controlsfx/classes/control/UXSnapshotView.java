package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import org.controlsfx.control.SnapshotView;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXSnapshotView")
@Reflection.Namespace(ControlsFXExtension.NS)
public class UXSnapshotView extends UXControl<SnapshotView> {
    public UXSnapshotView(Environment env, SnapshotView wrappedObject) {
        super(env, wrappedObject);
    }
    public UXSnapshotView(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    interface WrappedInterface{
        @Reflection.Property double fixedSelectionRatio();
        @Reflection.Property double selectionBorderWidth();

        // @Reflection.Property boolean hasSelection();
        @Reflection.Property boolean selectionChanging();
        @Reflection.Property boolean selectionActive();
        @Reflection.Property boolean selectionActivityManaged();
        @Reflection.Property boolean selectionMouseTransparent();
        @Reflection.Property boolean selectionRatioFixed();

        @Reflection.Property SnapshotView.Boundary selectionAreaBoundary();
        @Reflection.Property SnapshotView.Boundary unselectedAreaBoundary();

        @Reflection.Property Node node();

        @Reflection.Property Rectangle2D selection();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new SnapshotView();
    }
    @Reflection.Getter
    public boolean getHasSelection(){
        return getWrappedObject().hasSelection();
    }
    @Reflection.Getter
    public Color getSelectionAreaFill(){
        Paint paint = getWrappedObject().getSelectionAreaFill();
        return (paint instanceof Color) ? (Color)paint : null;
    }
    @Reflection.Getter
    public Color getSelectionBorderPaint(){
        Paint paint = getWrappedObject().getSelectionBorderPaint();
        return (paint instanceof Color) ? (Color)paint : null;
    }
    @Reflection.Getter
    public Color getUnselectedAreaFill(){
        Paint paint = getWrappedObject().getUnselectedAreaFill();
        return (paint instanceof Color) ? (Color)paint : null;
    }

    @Reflection.Setter
    public void setSelectionAreaFill(Color color){
        getWrappedObject().setSelectionAreaFill(color);
    }
    @Reflection.Setter
    public void setSelectionBorderPaint(Color color){
        getWrappedObject().setSelectionBorderPaint(color);
    }
    @Reflection.Setter
    public void setUnselectedAreaFill(Color color){
        getWrappedObject().setUnselectedAreaFill(color);
    }
    @Reflection.Signature
    public void setSelection(Number upperLeftX, Number upperLeftY, Number width, Number height){
        getWrappedObject().setSelection(upperLeftX.doubleValue(), upperLeftY.doubleValue(), width.doubleValue(), height.doubleValue());
    }
}
