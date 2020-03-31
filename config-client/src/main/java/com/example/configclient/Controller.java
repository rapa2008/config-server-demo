package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration get(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
