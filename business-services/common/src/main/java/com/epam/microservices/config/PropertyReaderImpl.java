package com.epam.microservices.config;

import com.netflix.config.ConfigurationManager;
import com.netflix.config.DynamicIntProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

import java.io.IOException;

public class PropertyReaderImpl implements PropertyReader {

    public static final String UNDEFINED_STRING_PROPERTY = "undefined";

    public static final int UNDEFINED_INT_PROPERTY = -1;

    public PropertyReaderImpl(String... configFiles) {
        for (String configFile : configFiles) {
            try {
                ConfigurationManager.loadCascadedPropertiesFromResources(configFile);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
    }

    @Override
    public String getStringProperty(String propName) {
        if (propName == null) {
            return UNDEFINED_STRING_PROPERTY;
        }
        DynamicStringProperty property = DynamicPropertyFactory.getInstance().getStringProperty(propName, UNDEFINED_STRING_PROPERTY);
        return property.get();
    }

    @Override
    public int getIntProperty(String propName) {
        if(propName == null){
            return UNDEFINED_INT_PROPERTY;
        }
        DynamicIntProperty intProperty = DynamicPropertyFactory.getInstance().getIntProperty(propName, UNDEFINED_INT_PROPERTY);
        return intProperty.get();
    }
}