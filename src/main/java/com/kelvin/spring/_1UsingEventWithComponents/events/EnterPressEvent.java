package com.kelvin.spring._1UsingEventWithComponents.events;

import com.kelvin.spring._1UsingEventWithComponents.components.TextField;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 *  过滤事件
 *
 * @author Kelvin范显
 * @createDate 2018年08月17日
 */
@DomEvent(value = "keypress", filter = "event.key == 'Enter'")
public class EnterPressEvent extends ComponentEvent<TextField> {
    public EnterPressEvent(TextField source, boolean fromClient) {
        super(source, fromClient);
    }
}
