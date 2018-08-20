package com.kelvin.spring._2SimpleComponentUsingElementAPI;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */

@Tag(Tag.INPUT)
public class TextField extends Component {

    public TextField(String value) {
        getElement().setProperty("value", value);
    }

    @Synchronize("change")//使浏览器发送属性变更给服务端
    public String getValue(){
        return getElement().getProperty("value");
    }
    public void setValue(String value){
        getElement().setProperty("value", value);
    }
}
