package com.test.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ComputeClientHystrix implements ComputerClient{

    @Override
    public Integer add(@PathVariable("a") Integer a,@PathVariable("b") Integer b) {
        return -999999;
    }
}
