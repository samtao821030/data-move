package com.jsti.data.output.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/data",method = RequestMethod.GET)
    public String queryDate(){
        return "hello,data output";
    }
}
