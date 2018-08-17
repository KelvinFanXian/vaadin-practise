package com.kelvin.spring._1UsingEventWithComponents.events;

import com.kelvin.spring._1UsingEventWithComponents.components.TextField;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;


/**
 * 1定义事件
 * 事件用于事件总线须继承于ComponentEvent。 基类以触发事件的组件类型参数化，所以getSource()可以自动的返回正确组件类型
 * 第二个构造函数参数用于使用户知道是否事件被DOM事件于浏览器中触发，或者通过组件的服务端API
 */
@DomEvent("change") // 自客户端触发事件
public class ChangeEvent extends ComponentEvent<TextField> {
    public ChangeEvent(TextField source, boolean fromClient) {
        super(source, fromClient);
    }
}
