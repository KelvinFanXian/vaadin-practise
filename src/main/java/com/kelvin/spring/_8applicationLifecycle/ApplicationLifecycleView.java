package com.kelvin.spring._8applicationLifecycle;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.server.WrappedSession;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
@Route("application-lifecycle")
public class ApplicationLifecycleView extends VerticalLayout {
    public ApplicationLifecycleView() {
        add(new H2("Application Lifecycle"));

        add(new H4("1）部署"));
        add(new H4("2）卸载和重新部署"));
        add(new H4("3）Vaadin Servlet和Service"));
        add(new H4("4）自定义Vaadin Servlet"));
        add(new H4("5）自定义Vaadin Service"));
        add(new H4("6）User Session"));
        add(new UnorderedList(new ListItem[]{
                new ListItem("You can obtain the VaadinSession of a UI with getSession() or globally with VaadinSession.getCurrent()"),
                new ListItem("A session ends after the last UI instance expires or is closed, as described later.")
        }));
        add(new H4("7）Handling Session Initialization and Destruction"));
        add(new UnorderedList(new ListItem[]{
                new ListItem("You can handle session initialization and destruction by implementing a SessionInitListener or SessionDestroyListener.")
        }));
        add(new H4("8）加载一个UI"));
        add(new H4("9）自定义加载页"),
            new UnorderedList(new ListItem[]{
                new ListItem("customized by implementing a BootstrapListener that modifies the DOM object")
            }));
        add(new H4("10）UI Expiration"));
    }
}
