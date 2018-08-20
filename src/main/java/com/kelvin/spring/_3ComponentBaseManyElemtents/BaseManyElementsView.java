package com.kelvin.spring._3ComponentBaseManyElemtents;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@Route("many-elements")
public class BaseManyElementsView extends VerticalLayout {

    public BaseManyElementsView() {
        add(new H2("Creating a Component Based on Many Elements"));

        TextField textField = new TextField();
        add(textField);

        ///settings
        textField.addChangeLisenter(e -> {
            if (StringUtils.isNotBlank(textField.getValue())) {
                add(new Label(textField.getValue()));
            }
        });

    }
}
