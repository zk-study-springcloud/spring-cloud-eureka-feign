package com.github.zk.springcloudfeign.service.impl;

import com.github.zk.springcloudfeign.remote.EurekaClientFeign;
import com.github.zk.springcloudfeign.service.IDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaokai
 * @date 2019/5/19 下午11:09
 */
@Service
public class DemoImpl implements IDemo {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;
    @Override
    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
