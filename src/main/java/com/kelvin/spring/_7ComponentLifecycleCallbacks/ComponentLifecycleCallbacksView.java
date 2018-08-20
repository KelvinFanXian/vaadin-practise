package com.kelvin.spring._7ComponentLifecycleCallbacks;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
@Route("component-lifecycle-callbacks")
public class ComponentLifecycleCallbacksView extends VerticalLayout {

    public ComponentLifecycleCallbacksView() {
        add(new H2("Component Lifecycle Callbacks"));
        add(new Paragraph("不大清楚这里的attachEvent.getSession()"));
        VaadinSession.getCurrent().setAttribute("username","Kelvin");

        add(new UserNameLabel());
    }
}
