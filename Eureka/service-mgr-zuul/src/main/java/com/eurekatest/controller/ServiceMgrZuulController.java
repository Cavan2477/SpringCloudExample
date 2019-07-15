/*
 * module: service-mgr-zuul
 * file: ServiceMgrZuulController
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceMgrZuulController {
//    @Value("${eureka.client.availabilityZones.default}")
//    private String eurekaClientAvailabilityZonesDefault;
//
//    @Value("${eureka.client.serviceUrl.defaultZone}")
//    private String eurekaClientServiceUrlDefaultZone;
//
//    @GetMapping("/eurekaClientAvailabilityZonesDefault")
//    public ResponseEntity<String> eurekaClientAvailabilityZonesDefault()
//    {
//        return new ResponseEntity<>(eurekaClientAvailabilityZonesDefault, HttpStatus.OK);
//    }
//
//    @GetMapping("/eurekaClientServiceUrlDefaultZone")
//    public ResponseEntity<String> eurekaClientServiceUrlDefaultZone()
//    {
//        return new ResponseEntity<>(eurekaClientServiceUrlDefaultZone, HttpStatus.OK);
//    }

    @GetMapping("/zuul-service")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello zuul-service", HttpStatus.OK);
    }
}
