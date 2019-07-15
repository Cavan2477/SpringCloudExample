/*
 * module: service-business-mall
 * file: ServiceBusinessOrderFallback
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.service;

import com.eurekatest.globalConst.ServiceInfo;
import com.eurekatest.jarmodel.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

/**
 * 断路器机制是为了保证服务的高可用，相关方法的返回提示信息可自行修改和实现
 */
@Component
public class ServiceBusinessOrderFallback implements IServiceBusinessOrder {
    private ResponseEntity<String> unifyReponse() {
        return new ResponseEntity<>(ServiceInfo.SERVICE_CLOSE, HttpStatus.FORBIDDEN);
    }

    @Override
    public String configParam() {
        return ServiceInfo.SERVICE_CLOSE;
    }

    @Override
    public ResponseEntity<String> hello() {
        return unifyReponse();
    }

    @Override
    public ResponseEntity<String> test() {
        return unifyReponse();
    }

    @Override
    public List<Order> list() {
        return Collections.emptyList();
    }

    @Override
    public Order loadByOrderId(@PathVariable("orderId") String orderId) {
        return new Order("undefined id", "error");
    }
}
