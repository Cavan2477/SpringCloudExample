/*
 * module: service-mgr-zipkin
 * file: ServiceMgrZipkinController
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceMgrZipkinController {
    @GetMapping("/service-mgr-zipkin/hello")
    public String hello() {
        return "Hello service mgr zipkin";
    }
}
