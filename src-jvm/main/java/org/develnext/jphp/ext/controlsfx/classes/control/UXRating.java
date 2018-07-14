package org.develnext.jphp.ext.controlsfx.classes.control;

import javafx.geometry.Orientation;
import org.controlsfx.control.Rating;
import org.develnext.jphp.ext.controlsfx.ControlsFXExtension;
import org.develnext.jphp.ext.javafx.classes.UXControl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("UXRating")
@Reflection.Namespace(ControlsFXExtension.NS)
public class UXRating extends UXControl<Rating> {
    public UXRating(Environment env, Rating wrappedObject) {
        super(env, wrappedObject);
    }
    public UXRating(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    interface WrappedInterface{
        @Reflection.Property int max();

        @Reflection.Property boolean partialRating();
        @Reflection.Property boolean updateOnHover();
        @Reflection.Property Orientation orientation();

        @Reflection.Property double rating();
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new Rating();
    }
    @Reflection.Signature
    public void __construct(int max){
        __wrappedObject = new Rating(max);
    }
}
