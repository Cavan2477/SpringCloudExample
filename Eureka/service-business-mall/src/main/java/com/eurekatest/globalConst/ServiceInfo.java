/*
 * module: service-business-mall
 * file: ServiceInfo
 * date: 18-11-2 上午10:23
 * author: CavanLiu
 * copyright: (c) 2018 www.onechain001.com Inc. All rights reserved.
 * 注意：本内容仅限于上海旺链信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目的，否则将依法追责。
 */

package com.eurekatest.globalConst;

public class ServiceInfo {
    public static final String
            VERSION = "/1.0",
            SERVICE_CLOSE = "Service is close, please wait...",
            SERVICE_BUSINESS_MALL = "service-business-mall",
            SERVICE_BUSINESS_ORDER = "service-business-order",
            SERVICE_BUSINESS_DIGITAL_CURRENCY = "service-business-digitalCurrency";

    public static final String
            REQUEST_SERVICE_BUSINESS_MALL = "/" + SERVICE_BUSINESS_MALL,
            REQUEST_SERVICE_BUSINESS_ORDER = "/" + SERVICE_BUSINESS_ORDER,
            REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY = "/" + SERVICE_BUSINESS_DIGITAL_CURRENCY;

    public static final String
            REQUEST_SERVICE_BUSINESS_ORDER_VERSION = REQUEST_SERVICE_BUSINESS_ORDER + VERSION,
            REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY_VERSION = REQUEST_SERVICE_BUSINESS_DIGITAL_CURRENCY + VERSION;
}
