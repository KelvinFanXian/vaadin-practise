package com.kelvin.spring._5ComponentUsingExisting;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.Label;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
public class TextField  extends Composite<Div> {

    private Label label;
    private Input input;

    public TextField(String labelText, String value) {
        label = new Label(labelText);
        input = new Input();
        input.setValue(value);

        getContent().add(label, input);
    }

    public String getValue() {
        return input.getValue();
    }
    public void setValue(String value) {
        input.setValue(value);
    }

    public String getLabel() {
        return label.getText();
    }
    public void setLabel(String labelText) {
        label.setText(labelText);
    }
}
