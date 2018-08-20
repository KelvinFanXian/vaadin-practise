package com.kelvin.spring._8applicationLifecycle;

import com.vaadin.flow.server.*;

import javax.servlet.ServletException;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
public class MyServlet extends VaadinServlet
    implements SessionInitListener, SessionDestroyListener {
    @Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();
        getService().addSessionInitListener(this);
        getService().addSessionDestroyListener(this);
    }

    @Override
    public void sessionDestroy(SessionDestroyEvent event) {
        System.out.println("session start...");
    }

    @Override
    public void sessionInit(SessionInitEvent event) throws ServiceException {
        System.out.println("session end...");
    }
}
