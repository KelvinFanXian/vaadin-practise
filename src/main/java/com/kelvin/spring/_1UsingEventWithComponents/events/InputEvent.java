package com.kelvin.spring._1UsingEventWithComponents.events;

import com.kelvin.spring._1UsingEventWithComponents.components.TextField;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DebounceSettings;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.dom.DebouncePhase;

/**
 *  限制事件频率
 *
 * @author Kelvin范显
 * @createDate 2018年08月17日
 */

@DomEvent(value = "input",
            debounce = @DebounceSettings(
                    timeout = 250,
                    phases = DebouncePhase.TRAILING))
public class InputEvent extends ComponentEvent<TextField> {
    private String value;

    public InputEvent(TextField source, boolean fromClient,
              @EventData("element.value") String value) {
        super(source, fromClient);
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
