package org.develnext.jphp.ext.controlsfx.support.event;

import javafx.event.EventHandler;
import org.controlsfx.control.NotificationPane;
import org.develnext.jphp.ext.javafx.support.EventProvider;

public class NotificationPaneEventProvider extends EventProvider<NotificationPane>{
    public NotificationPaneEventProvider(){
        setHandler("hidden", new Handler() {
            @Override
            public void set(NotificationPane target, EventHandler eventHandler) {
                target.setOnHidden(eventHandler);
            }

            @Override
            public EventHandler get(NotificationPane target) {
                return target.getOnHidden();
            }
        });

        setHandler("hiding", new Handler() {
            @Override
            public void set(NotificationPane target, EventHandler eventHandler) {
                target.setOnHiding(eventHandler);
            }

            @Override
            public EventHandler get(NotificationPane target) {
                return target.getOnHiding();
            }
        });

        setHandler("showing", new Handler() {
            @Override
            public void set(NotificationPane target, EventHandler eventHandler) {
                target.setOnShowing(eventHandler);
            }

            @Override
            public EventHandler get(NotificationPane target) {
                return target.getOnShowing();
            }
        });

        setHandler("shown", new Handler() {
            @Override
            public void set(NotificationPane target, EventHandler eventHandler) {
                target.setOnShown(eventHandler);
            }

            @Override
            public EventHandler get(NotificationPane target) {
                return target.getOnShown();
            }
        });
    }


    @Override
    public Class<NotificationPane> getTargetClass() {
        return NotificationPane.class;
    }
}
