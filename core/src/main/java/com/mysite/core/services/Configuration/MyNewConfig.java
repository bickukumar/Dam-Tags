package com.mysite.core.services.Configuration;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "New Configuration")
public @interface MyNewConfig {
    @AttributeDefinition(name = "Property one")
    int prop1() default 10;
    @AttributeDefinition(name = "Property two")
    int prop2() default 20;
}
