package com.kelvin.spring._2SimpleComponentUsingElementAPI;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
@Route("simple-component")
public class SimpleComponentView extends VerticalLayout {

    public SimpleComponentView() {

        add(new Paragraph("创建一个简单的组件（使用Element API）"));
        add(new Html("<span>@Synchronize(\"change\")//使浏览器发送属性变更给服务端<br/>" +
                "    public String getValue(){<br/>" +
                "        return getElement().getProperty(\"value\");<br/>" +
                "    }</span>"));
        TextField textField = new TextField("defaultValue");
        add(textField);
        Button submit = new Button("submit");
        add(submit);
        Label label = new Label();
        add(label);

        ///settings
        label.setText(textField.getValue());
        submit.addClickListener(e -> label.setText(textField.getValue()));
    }
}
