package com.ecommerceapp.controllers;

import com.ecommerceapp.service.ServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class RootController {
    Logger logger = LoggerFactory.getLogger(RootController.class);

    private ServiceClient serviceClient;
    public RootController(ServiceClient serviceClient){
        this.serviceClient = serviceClient;
    }

    
}
