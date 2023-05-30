package com.epam.microservices.one.service;


import com.epam.microservices.two.TwoServiceAPI;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "two")
public interface TwoServiceClient extends TwoServiceAPI {
}
