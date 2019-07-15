/*
 * module: service-business-mall
 * file: ServiceBusinessMallController
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.controller;

import com.eurekatest.jarmodel.model.Order;
import com.eurekatest.service.IServiceBusinessDigitalCurrency;
import com.eurekatest.service.IServiceBusinessOrder;
import com.eurekatest.globalConst.ServiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.eurekatest.globalConst.ServiceInfo.*;

@RestController
@RefreshScope
public class ServiceBusinessMallController {
    protected Logger logger = LoggerFactory.getLogger(ServiceBusinessMallController.class);

    @Autowired
    private IServiceBusinessOrder serviceBusinessOrder;

    @Autowired
    private IServiceBusinessDigitalCurrency serviceBusinessDigitalCurrency;

    @Value("${configParam}")
    private String configParam;

    public String getConfigParam() {
        return configParam;
    }

    public void setConfigParam(String configParam) {
        this.configParam = configParam;
    }

    @GetMapping("/configParam")
    public String configParam() {
        return this.configParam;
    }

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_MALL + "/{msg}")
    public String mallTest(@PathVariable String msg) {
        String strMsg = "Calling " + ServiceInfo.SERVICE_BUSINESS_MALL + ":" + msg;

        logger.info(strMsg);

        return strMsg;
    }

    @GetMapping("/")
    public String home() {
        return "Hello " + ServiceInfo.SERVICE_BUSINESS_MALL + " home.";
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello " + ServiceInfo.SERVICE_BUSINESS_MALL, HttpStatus.OK);
    }

    // ------------------------------------------------------------------------
    // service-business-order
    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER + "/configParam")
    public String orderConfigParam() {
        logger.info("Service mall calling " + ServiceInfo.SERVICE_BUSINESS_ORDER + ":configParam");

        return this.serviceBusinessOrder.configParam();
    }

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER + "/hello")
    public ResponseEntity<String> helloOrder() {
        logger.info("Service mall calling " + ServiceInfo.SERVICE_BUSINESS_ORDER + ":hello");

        return this.serviceBusinessOrder.hello();
    }

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER + "/test")
    public ResponseEntity<String> testOrder() {
        logger.info("Service mall calling service-business-order:test");

        return this.serviceBusinessOrder.test();
    }

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER + "/list")
    public List<Order> orderList() {
        logger.info("Service mall calling service-business-order:orderList");

        return this.serviceBusinessOrder.list();
    }

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_ORDER + "/{orderId}")
    public Order detail(@PathVariable String orderId) {
        logger.info("Service mall calling service-business-order:detail");

        return this.serviceBusinessOrder.loadByOrderId(orderId);
    }

    // ------------------------------------------------------------------------
    // service-business-digital-currency
    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY + "/configParam")
    public String digitalCurrencyConfigParam() {
        logger.info("Service mall calling " + ServiceInfo.REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY + ":configParam");

        return this.serviceBusinessDigitalCurrency.configParam();
    }

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY + "/test")
    public ResponseEntity<String> testDigitalCurrency() {
        logger.info("Service mall calling " + ServiceInfo.SERVICE_BUSINESS_DIGITAL_CURRENCY + ":test");

        return this.serviceBusinessDigitalCurrency.test();
    }

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY + "/hello")
    public ResponseEntity<String> helloDigitalCurrency() {
        logger.info("Service mall calling " + ServiceInfo.SERVICE_BUSINESS_DIGITAL_CURRENCY + ":hello");

        return this.serviceBusinessDigitalCurrency.hello();
    }
}
