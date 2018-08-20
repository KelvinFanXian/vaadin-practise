package com.kelvin.spring._2SimpleComponentUsingElementAPI;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.shared.Registration;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@Tag(Tag.BUTTON)
public class Button extends Component {
    public Button(String text) {
        getElement().setText(text);
    }

    public Registration addClickListener(ComponentEventListener<ClickEvent> listener) {
        return addListener(ClickEvent.class, listener);
    }
}
