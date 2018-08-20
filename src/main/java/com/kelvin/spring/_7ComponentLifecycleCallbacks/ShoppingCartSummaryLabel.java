package com.kelvin.spring._7ComponentLifecycleCallbacks;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.DetachEvent;

import java.util.EventObject;
import java.util.function.Consumer;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
public class ShoppingCartSummaryLabel extends Component {

    private final Consumer<EventObject> eventHandler = this::onCartSummaryUpdate;

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        ShopEventBus eventBus = attachEvent.getSession().getAttribute(ShopEventBus.class);
        //注册到时间总线，为更新自其他组件
        eventBus.register(eventHandler);
    }

    @Override
    protected void onDetach(DetachEvent detachEvent) {
        ShopEventBus eventBus = detachEvent.getSession().getAttribute(ShopEventBus.class);
        // 分离后无需任何更新
        eventBus.unregister(eventHandler);
    }

    private void onCartSummaryUpdate(EventObject eventObject) {
        // 更新购物车概要
    }

    interface ShopEventBus {
        void register(Consumer<EventObject> eventHandler);

        void unregister(Consumer<EventObject> eventHandler);
    }
}
