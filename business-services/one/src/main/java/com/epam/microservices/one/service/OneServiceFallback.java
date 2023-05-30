package com.epam.microservices.one.service;

import org.springframework.web.bind.annotation.PathVariable;

public class OneServiceFallback implements OneService {

    @Override
    public String callService(@PathVariable("id") String customerId) {
        throw new RuntimeException("Call service with customerId: " + customerId);
    }

    @Override
    public String callService2(@PathVariable("id") String customerId) {
        throw new RuntimeException("Call service with customerId: " + customerId);

    }

    @Override
    public String testProperty(@PathVariable("propertyName") String propertyName) {
        throw new RuntimeException("Call service with propertyName: " + propertyName);
    }
}
