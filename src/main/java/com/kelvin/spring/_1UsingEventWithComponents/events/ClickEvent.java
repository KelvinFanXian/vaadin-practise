package com.kelvin.spring._1UsingEventWithComponents.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.component.html.NativeButton;

/**
 * 添加事件数据
 *
 *  事件可能包含关于发生的事件的额外信息，比如，哪个鼠标按钮被用于点击事件。 如果你使用 @DomEvent，任何额外
 *  构造函数都应该有一个 @EventData注解，其告诉该框架什么数据从浏览器发送来
 *  ...
 * @EventData 定义以js运行于浏览器， 以可得的DOM事件作为事件，以及监听器可添加的element作为element。
 * 更多可参见DomListenerRegistration.addEventData 的java文档，关于事件数据被收集和发送到服务端
 */

@DomEvent("click")
public class ClickEvent extends ComponentEvent<NativeButton> {
    private final int button;

    public ClickEvent(NativeButton source, boolean fromClient,
              @EventData("event.button") int button) {
        super(source, fromClient);
        this.button = button;
    }

    public int getButton() {
        return button;
    }
}
