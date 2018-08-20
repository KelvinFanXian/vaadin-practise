package com.kelvin.spring._6CreatingContainer;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.dom.ElementFactory;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@Tag(Tag.DIV)
public class MyComponentContainer extends Component {

//    public void add(Component child) {
//        getElement().appendChild(child.getElement());
//    }
    public void add(Component child) {
        Element childWrapper = ElementFactory.createSpan();
        childWrapper.appendChild(child.getElement());
        getElement().appendChild(childWrapper);
    }

    public void remove(Component child) {
        Element wrapper = child.getElement().getParent();
        wrapper.removeFromParent();
    }
}
