package com.kelvin.spring._5ComponentUsingExisting;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
@Route("existing-components")
public class ExistingComponentsView extends VerticalLayout {

    public ExistingComponentsView() {
        add(new H2("Creating a Component Using Existing Components"));

        add(new UnorderedList(new ListItem[]{
                new ListItem("public class TextField  extends Composite<Div> "),
                new ListItem("getContent().add(label, input);")
        }));

        TextField name = new TextField("姓名", "凯文");
        Label label = new Label();
        Button submit = new Button("submit");
        add(name,submit,label);
        submit.addClickListener(e -> label.setText(name.getValue()));
    }
}
