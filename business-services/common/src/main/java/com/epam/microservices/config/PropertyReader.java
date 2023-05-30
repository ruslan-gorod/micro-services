package com.epam.microservices.config;

public interface PropertyReader {

    /**
     * @param propName property name to get
     * @return String property representation or "undefined" if property not found
     */
    String getStringProperty(String propName);

    /**
     * @param propName property name to get
     * @return int property representation or -1 if property not found
     */
    int getIntProperty(String propName);
}

