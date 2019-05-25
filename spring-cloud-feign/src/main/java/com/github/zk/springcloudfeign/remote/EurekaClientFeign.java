package com.github.zk.springcloudfeign.remote;

import com.github.zk.springcloudfeign.configuration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaokai
 * @date 2019/5/19 下午11:05
 */
@FeignClient(value = "eureka-client" , configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @RequestMapping("/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
