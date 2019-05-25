package com.github.zk.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokai
 * @date 2019/5/19 下午10:24
 */
@RestController
public class HiController {
    @Value("${server.port}")
    private int port;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "hi," + name + " i`m " + port;
    }
}
