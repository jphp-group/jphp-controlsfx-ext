package org.develnext.jphp.ext.controlsfx;

import org.controlsfx.control.*;
import org.develnext.jphp.ext.controlsfx.classes.UXPlusMinusEvent;
import org.develnext.jphp.ext.controlsfx.classes.cell.UXGridCell;
import org.develnext.jphp.ext.controlsfx.classes.control.*;
import org.develnext.jphp.ext.controlsfx.support.event.NotificationPaneEventProvider;
import org.develnext.jphp.ext.controlsfx.support.event.PlusMinusSliderEventProvider;
import org.develnext.jphp.ext.controlsfx.support.memory.ArrowLocationMemoryOperation;
import org.develnext.jphp.ext.controlsfx.support.memory.SnapshotViewBoundaryMemoryOperation;
import org.develnext.jphp.ext.javafx.support.EventProvider;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;
import php.runtime.memory.support.MemoryOperation;
import sun.reflect.generics.scope.Scope;

public class ControlsFXExtension extends Extension {
    public static final String NS = "php\\gui\\controlsfx";
    
    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }
    
    @Override
    public void onRegister(CompileScope scope){
        registerMemoryOperations();
        registerControls(scope);
        registerEvents(scope);
    }
    private void registerControls(CompileScope scope){
        registerWrapperClass(scope, MaskerPane.class, UXMaskerPane.class);
        registerWrapperClass(scope, MasterDetailPane.class, UXMasterDetailPane.class);
        registerWrapperClass(scope, RangeSlider.class, UXRangeSlider.class);

        registerWrapperClass(scope, GridView.class, UXGridView.class);
        registerWrapperClass(scope, GridCell.class, UXGridCell.class);

        registerWrapperClass(scope, HiddenSidesPane.class, UXHiddenSidesPane.class);
        registerWrapperClass(scope, InfoOverlay.class, UXInfoOverlay.class);
        // registerWrapperClass(scope, ListSelectionView.class, UXListSelectionView.class);
        registerWrapperClass(scope, NotificationPane.class, UXNotificationPane.class);

        registerWrapperClass(scope, PlusMinusSlider.class, UXPlusMinusSlider.class);
        registerWrapperClass(scope, Rating.class, UXRating.class);
        // registerWrapperClass(scope, SegmentedButton.class, UXSegmentedButton.class);
        // registerWrapperClass(scope, SnapshotView.class, UXSnapshotView.class);
        registerWrapperClass(scope, StatusBar.class, UXStatusBar.class);
        registerWrapperClass(scope, ToggleSwitch.class, UXToggleSwitch.class);

        registerWrapperClass(scope, PopOver.class, UXPopOver.class);
    }
    private void registerMemoryOperations(){
        MemoryOperation.register(new ArrowLocationMemoryOperation());
        // MemoryOperation.register(new SnapshotViewBoundaryMemoryOperation());
    }
    private void registerEvents(CompileScope scope){
        EventProvider.register(new NotificationPaneEventProvider());
        EventProvider.register(new PlusMinusSliderEventProvider());

        registerWrapperClass(scope, PlusMinusSlider.PlusMinusEvent.class, UXPlusMinusEvent.class);
    }

    @Override
    public String[] getPackageNames(){
        return new String[]{"gui", "controlsfx"};
    }
}