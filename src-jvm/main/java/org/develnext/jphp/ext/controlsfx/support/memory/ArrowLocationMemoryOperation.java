package org.develnext.jphp.ext.controlsfx.support.memory;

import org.controlsfx.control.PopOver;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.StringMemory;
import php.runtime.memory.support.MemoryOperation;

public class ArrowLocationMemoryOperation extends MemoryOperation<PopOver.ArrowLocation> {
    @Override
    public Class<?>[] getOperationClasses() {
        return new Class[]{PopOver.ArrowLocation.class };
    }

    @Override
    public PopOver.ArrowLocation convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable {
        return PopOver.ArrowLocation.valueOf(memory.toString());
    }

    @Override
    public Memory unconvert(Environment environment, TraceInfo traceInfo, PopOver.ArrowLocation arrowLocation) throws Throwable {
        return new StringMemory(arrowLocation.toString());
    }
}
