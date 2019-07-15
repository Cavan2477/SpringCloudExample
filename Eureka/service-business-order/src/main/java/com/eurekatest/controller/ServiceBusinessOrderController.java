/*
 * module: service-business-order
 * file: ServiceBusinessOrderController
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.controller;

import com.eurekatest.jarmodel.model.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.eurekatest.globalConst.globalConst.*;

@RestController
@RefreshScope
@RequestMapping(COMMOM_REQUEST_SERVICE_BUSINESS_ORDER)
public class ServiceBusinessOrderController {
    private final String SERVICE_NAME = "service-business-order";

    @Value("${server.port}")
    private String serverPort;

    @Value("${configParam}")
    private String configParam;

    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String eurekaClientServiceUrlDefaultZone;

    @GetMapping("/configParam")
    public String configParam() {
        return this.configParam;
    }

    @GetMapping("/eurekaClientServiceUrlDefaultZone")
    public String eurekaClientServiceUrlDefaultZone() {
        return this.eurekaClientServiceUrlDefaultZone;
    }

    public String getConfigParam() {
        return configParam;
    }

    public void setConfigParam(String configParam) {
        this.configParam = configParam;
    }

    private String getServerPort() {
        return "Server port is " + serverPort;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> Hello() {
        return new ResponseEntity<>("hello " + SERVICE_NAME + getServerPort(), HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("test " + SERVICE_NAME + getServerPort(), HttpStatus.OK);
    }

    @GetMapping(value = "/list")
    public List<Order> list() {
        return this.buildOrders();
    }

    @GetMapping(value = "/{orderId}")
    public Order detail(@PathVariable String orderId) {
        List<Order> listOrder = this.buildOrders();

        for (Order order : listOrder) {
            if (order.getOrderId().equalsIgnoreCase(orderId))
                return order;
        }

        return null;
    }

    protected List<Order> buildOrders() {
        List<Order> listOrder = new ArrayList<>();

        listOrder.add(new Order("1", "description1"));
        listOrder.add(new Order("2", "description2"));
        listOrder.add(new Order("3", "description3"));

        return listOrder;
    }
}
