/*
 * module: server-mgr-eureka
 * file: ServerMgrEurekaApplication
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.logging.Logger;

@EnableEurekaServer
@SpringBootApplication
public class ServerMgrEurekaApplication {
    static org.slf4j.Logger logger = LoggerFactory.getLogger(ServerMgrEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServerMgrEurekaApplication.class, args);

        logger.info("test1------------------->>>>");
        logger.info("test2------------------->>>>");
        logger.info("test3------------------->>>>");
        logger.info("test4------------------->>>>");
    }
}
