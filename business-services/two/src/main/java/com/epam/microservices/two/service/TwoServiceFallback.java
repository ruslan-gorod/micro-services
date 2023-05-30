package com.epam.microservices.two.service;

import com.epam.microservices.two.TwoServiceAPI;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TwoServiceFallback implements TwoServiceAPI {

    @Override
    public String getSomething1(@PathVariable("id") String customerId) {
        throw new RuntimeException("Call service with customerId " + customerId);
    }

    @Override
    public String getSomething2(@PathVariable("id") String customerId) {
        throw new RuntimeException("Call service with customerId " + customerId);
    }
}
