/*
 * module: service-business-mall
 * file: IServiceBusinessDigitalCurrency
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.service;

import com.eurekatest.globalConst.ServiceInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import static com.eurekatest.globalConst.ServiceInfo.*;

// 对应SERVICE-BUSINESS-DIGITAL-CURRENCY的RESTful服务
@FeignClient(name = "SERVICE-BUSINESS-DIGITAL-CURRENCY", fallback = ServiceBusinessDigitalCurrencyFallback.class)
public interface IServiceBusinessDigitalCurrency {
    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY_VERSION + "/configParam")
    String configParam();

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY_VERSION + "/hello")
    ResponseEntity<String> hello();

    @GetMapping(ServiceInfo.REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY_VERSION + "/test")
    ResponseEntity<String> test();
}
