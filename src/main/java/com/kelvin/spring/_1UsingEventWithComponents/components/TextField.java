package com.kelvin.spring._1UsingEventWithComponents.components;

import com.kelvin.spring._1UsingEventWithComponents.events.ChangeEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.shared.Registration;

/**
 * @author Kelvin范显
 * @createDate 2018年08月17日
 */
@Tag("input")
public class TextField extends Component {
    public Registration addChangeListener(ComponentEventListener<ChangeEvent> listener){
        return addListener(ChangeEvent.class, listener);
    }

    //自服务端触发事件
    public void setValue(String value){
        getElement().setAttribute("value", value);
        fireEvent(new ChangeEvent(this,false));
    }
}
