package com.kelvin.spring._3ComponentBaseManyElemtents;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@DomEvent("change")
public class ChangeEvent extends ComponentEvent<TextField> {

    public ChangeEvent(TextField source, boolean fromClient) {
        super(source, fromClient);
    }
}
