package com.kelvin.spring._4HelperDefineComponentProperties;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;

import java.util.Optional;

/**
 * @author Kelvin范显
 * @createDate 2018年08月20日
 */
@Tag(Tag.INPUT)
public class TextField extends Component {
    private static PropertyDescriptor<String, String> VALUE
            = PropertyDescriptors.propertyWithDefault("value","");
    private static PropertyDescriptor<String, Optional<String>> PLACEHOLDER =
            PropertyDescriptors.optionalAttributeWithDefault("placeholder", "");


    public String getValue() {
        return get(VALUE);
    }
    public void setValue(String value) {
        set(VALUE, value);
    }

    public Optional<String> getPlaceholder() {
        return get(PLACEHOLDER);
    }
    public void setPlaceholder(String placeholder) {
        set(PLACEHOLDER, placeholder);
    }
}
