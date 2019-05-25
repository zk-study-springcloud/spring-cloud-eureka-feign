package com.github.zk.springcloudfeign.controller;

import com.github.zk.springcloudfeign.service.IDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokai
 * @date 2019/5/19 下午11:11
 */
@RestController
public class HiController {
    @Autowired
    private IDemo iDemo;
    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return iDemo.sayHi(name);
    }
}
