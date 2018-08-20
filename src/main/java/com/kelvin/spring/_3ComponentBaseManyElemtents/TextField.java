package com.kelvin.spring._3ComponentBaseManyElemtents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.shared.Registration;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@Tag(Tag.DIV)
public class TextField extends Component {
    Element labelElement = new Element("label");
    Element inputElement = new Element("input");

    public TextField() {
        inputElement.synchronizeProperty("value","change");
        getElement().appendChild(labelElement, inputElement);
    }

    public Registration addChangeLisenter(ComponentEventListener<ChangeEvent> listener){
        return addListener(ChangeEvent.class, listener);
    }

    public String getLabel() {
        return labelElement.getText();
    }

    public String getValue() {
        return inputElement.getProperty("value");
    }

    public void setLabel(String label) {
        labelElement.setText(label);
    }

    public void setValue(String value) {
        inputElement.setProperty("value", value);
    }
}
