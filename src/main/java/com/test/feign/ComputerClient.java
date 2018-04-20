package com.test.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// fallback用于熔断器,只需要写一个实现类,然后去实现请求方法
@FeignClient(value = "compute-service",fallback = ComputeClientHystrix.class)
public interface ComputerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add/{a}/{b}")
    Integer add(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b);
}
