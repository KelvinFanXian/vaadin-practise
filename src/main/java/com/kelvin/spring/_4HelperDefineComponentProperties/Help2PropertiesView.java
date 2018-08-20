package com.kelvin.spring._4HelperDefineComponentProperties;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@Route("help2properties")
public class Help2PropertiesView extends VerticalLayout {

    public Help2PropertiesView() {
        add(new H2("Using API Helpers for Defining Component Properties"));
        add(new Paragraph("暂时未仔细看。。"));
    }
}
