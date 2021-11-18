package com.mysite.core.services.Implementation;

import com.mysite.core.services.Configuration.MyNewConfig;
import com.mysite.core.services.TestConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = TestConfig.class)
@Designate(ocd = MyNewConfig.class)
public class TestConfigImpl implements TestConfig {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    public static int prop1;
    public static int prop2;

    @Activate
    public void activate(MyNewConfig newConfig){
        prop1 = newConfig.prop1();
        prop2 = newConfig.prop2();
    }

    //Optional to deactivate
    @Deactivate
    public void deactivate(MyNewConfig newConfig){
        LOGGER.info("Deactivated");
    }

    @Override
    public int getProp1() {
        return prop1;
    }

    @Override
    public int getProp2() {
        return prop2;
    }
}
