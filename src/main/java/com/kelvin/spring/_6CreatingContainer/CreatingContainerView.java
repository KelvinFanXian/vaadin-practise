package com.kelvin.spring._6CreatingContainer;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@Route("creating-container")
public class CreatingContainerView extends VerticalLayout {

    public CreatingContainerView() {
        add(new H2("Creating a Component Which Can Contain Other Components"));

        MyComponentContainer myComponentContainer = new MyComponentContainer();
        myComponentContainer.add(new Label("A"));
        myComponentContainer.add(new Label("B"));
        myComponentContainer.add(new Label("C"));

        add(myComponentContainer);
    }
}
