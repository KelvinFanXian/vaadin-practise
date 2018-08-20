package com.kelvin.spring._1UsingEventWithComponents;

import com.kelvin.spring._1UsingEventWithComponents.components.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the event-component.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("event-component")
@HtmlImport("src/usingEventWithComponents/event-component.html")
@Route("event-component")
public class EventComponentTemplate extends PolymerTemplate<EventComponentTemplate.EventComponentModel> {

    @Id("inputValue")
    private Label inputValue;
    @Id("myInput")
    private TextField myInput;
    @Id("vaadinTextField")
    private com.vaadin.flow.component.textfield.TextField vaadinTextField;

    /**
     * Creates a new EventComponentTemplate.
     */
    public EventComponentTemplate() {
        // You can initialise any data required for the connected UI components here.

        //注册监听器
        Registration registration = myInput
                .addChangeListener(e -> getModel().setInputValue(e.getSource().getValue()));
//        registration.remove();

        vaadinTextField.addValueChangeListener(e -> getModel().setVaadinTextFieldValue(e.getValue()));
    }

    /**
     * This model binds properties between EventComponentTemplate and event-component.html
     */
    public interface EventComponentModel extends TemplateModel {
        // Add setters and getters for template properties here.

        void setInputValue(String inputValue);

        void setVaadinTextFieldValue(String value);
    }
}
