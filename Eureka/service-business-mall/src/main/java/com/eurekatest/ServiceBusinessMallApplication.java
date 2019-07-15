/*
 * module: service-business-mall
 * file: ServiceBusinessMallApplication
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 断路器Dashboard url: http://IP:port/hystrix
 * 此处为:
 * http://localhost:55000/hystrix
 * http://localhost:55000/hystrix.stream
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker                // 断路器支持
@EnableHystrixDashboard                // 断路器Dashboard
@EnableFeignClients(basePackages = "com.eurekatest.**")
@EnableAutoConfiguration
public class ServiceBusinessMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBusinessMallApplication.class, args);
    }
}
