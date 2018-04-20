package com.test.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

    @SuppressWarnings(value = "all")
    @Autowired
    ComputerClient computerClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(){
        return computerClient.add(10,20);
    }
}
