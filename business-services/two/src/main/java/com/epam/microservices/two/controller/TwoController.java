package com.epam.microservices.two.controller;

import com.epam.microservices.two.TwoServiceAPI;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController implements TwoServiceAPI {

    @Override
    public String getSomething1(@PathVariable("id") String id) {
        return id.toUpperCase();
    }

    @Override
    public String getSomething2(@PathVariable("id") String id) {
        return id.toLowerCase();
    }
}
