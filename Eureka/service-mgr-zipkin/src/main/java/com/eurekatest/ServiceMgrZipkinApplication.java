/*
 * module: service-mgr-zipkin
 * file: ServiceMgrZipkinApplication
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */
package com.eurekatest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceMgrZipkinApplication {
    private static Logger log = LoggerFactory.getLogger(ServiceMgrZipkinApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceMgrZipkinApplication.class, args);
        //new SpringApplicationBuilder(ServiceZipkinApplication.class).web(true).run(args);
    }
}
