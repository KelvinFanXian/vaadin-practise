package com.kelvin.spring._7ComponentLifecycleCallbacks;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
@Tag(Tag.DIV)
public class UserNameLabel extends Component {
    public UserNameLabel() {
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {//当组件被附到UI时，该方法被调用
        System.out.printf("onAttach starting...");
        // 登录后，用户名可存储到session
        String username = (String) attachEvent.getSession().getAttribute("username");
        getElement().setText("Hello " + username + ", welcome back!");
    }
}
