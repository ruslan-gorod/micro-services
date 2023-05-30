package com.epam.microservices.one.controller;

import com.epam.microservices.config.PropertyReader;
import com.epam.microservices.one.service.OneService;
import com.epam.microservices.one.service.TwoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController implements OneService {

    @Autowired
    TwoServiceClient twoServiceClient;

    @Autowired
    PropertyReader propertyReader;

    @Override
    public String callService(@PathVariable("id") String id) {
        return "{one_call_two: " + twoServiceClient.getSomething1(id) + "}";
    }

    @Override
    public String callService2(@PathVariable("id") String id) {
        return "{one_call_two2: " + twoServiceClient.getSomething2(id) + "}";
    }

    @Override
    public String testProperty(@PathVariable("propertyName") String propertyName) {
        return propertyReader.getStringProperty(propertyName);
    }

}
