package org.develnext.jphp.ext.controlsfx.support.memory;

import org.controlsfx.control.SnapshotView;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.StringMemory;
import php.runtime.memory.support.MemoryOperation;

public class SnapshotViewBoundaryMemoryOperation extends MemoryOperation<SnapshotView.Boundary> {
    @Override
    public Class<?>[] getOperationClasses() {
        return new Class[]{SnapshotView.Boundary.class};
    }

    @Override
    public SnapshotView.Boundary convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable {
        return SnapshotView.Boundary.valueOf(memory.toString());
    }

    @Override
    public Memory unconvert(Environment environment, TraceInfo traceInfo, SnapshotView.Boundary boundary) throws Throwable {
        return StringMemory.valueOf(boundary.toString());
    }
}
