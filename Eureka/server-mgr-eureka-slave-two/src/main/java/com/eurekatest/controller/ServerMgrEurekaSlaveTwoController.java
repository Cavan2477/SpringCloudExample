/*
 * module: server-mgr-eureka-slaveTwo
 * file: ServerMgrEurekaSlaveTwoController
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerMgrEurekaSlaveTwoController {
    @GetMapping("/server-mgr-eureka-slaveTwo")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello " + this.getClass().getName(), HttpStatus.OK);
    }
}
