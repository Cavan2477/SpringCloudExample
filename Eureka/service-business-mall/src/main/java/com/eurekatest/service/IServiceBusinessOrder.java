/*
 * module: service-business-mall
 * file: IServiceBusinessOrder
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.service;

import com.eurekatest.jarmodel.model.Order;
import com.eurekatest.globalConst.ServiceInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static com.eurekatest.globalConst.ServiceInfo.*;

// 对应SERVICE-BUSINESS-ORDER的RESTful服务，负载均衡
@FeignClient(name = "SERVICE-BUSINESS-ORDER", fallback = ServiceBusinessOrderFallback.class)
public interface IServiceBusinessOrder {
    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER_VERSION + "/configParam")
    String configParam();

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER_VERSION + "/hello")
    ResponseEntity<String> hello();

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER_VERSION + "/test")
    ResponseEntity<String> test();

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER_VERSION + "/list")
    List<Order> list();

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER_VERSION + "/{orderId}")
    Order loadByOrderId(@PathVariable("orderId") String orderId);
}
