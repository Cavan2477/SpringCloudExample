/*
 * module: jar-model
 * file: Order
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.jarmodel.model;

import lombok.Data;

@Data
public class Order {
    private static final long serialVersionUID = 1L;

    private String orderId;
    private String des;

    public Order() {
    }

    public Order(String strOrderId, String strDes) {
        this.orderId = strOrderId;
        this.des = strDes;
    }
}
